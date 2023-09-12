




<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.Tareas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//crer una objeto que almacene los datos 

    if (session.getAttribute("listaTareas") == null) {
        ArrayList<Tareas> listaux = new ArrayList<Tareas>();
        session.setAttribute("listaTareas", listaux);
    }
    ArrayList<Tareas> lista = (ArrayList<Tareas>) session.getAttribute("listaTareas");

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 2</title>
    </head>
    <body>
        <h1  align="center">GESTOR DE TAREAS</h1>
        <h2 align="center">Nombre: Jose Antonio Nogales Mamani</h2>
         <a href="Main?op=nuevo">Nuevo registro</a>
        <table border="1" align="center">
            <tr>
                <th>ID</th>
                <th>TAREA</th>
              
                <th>ESTADO</th>
                <th></th>
            </tr>
             <%
            if (lista !=null) {
                    for( Tareas item : lista){
                
            %>
            <tr>
                <td><%=item.getId() %></td>
                <td><%=item.getActividad() %></td>
                
                <td><input  type="checkbox"/>completado</td>
              <td>
                    <a href="Main?op=editar&id=<%= item.getId()%>">Editar</a>
                   
                </td>
                <td>
                    <a href="Main?op=elminar&id=<%= item.getId()%>"
                       onclick="return(confirm('Esta seguro de Eliminar?? '))"
                       >Eliminar</a>
                </td>
            </tr>
              <%
                }
}
            %>
        </table>




    </body>
</html>
