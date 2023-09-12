<%-- 
    Document   : editar
    Created on : 11 sep. de 2023, 23:26:38
    Author     : nogal
--%>

<%@page import="com.emergentes.Tareas"%>
<%
 Tareas reg=(Tareas) request.getAttribute("miobjper");

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edicion</title>
    </head>
    <body>
        <h1>Inserte un nuevo registro</h1>
        <form action="Main" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="id" value="<%= reg.getId() %>" size="2" readonly/></td>
                       
                    </tr>
                    <tr>
                        <td>Actividad</td>
                         <td><input type="text" name="actividad" value="<%= reg.getActividad()%>"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Enviar"/></td>
                    </tr>
            </table>

            
        </form>
    </body>
</html>
