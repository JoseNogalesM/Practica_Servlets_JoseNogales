<%
   String nombre =request.getParameter("nombre");
   String correo=request.getParameter("correo");
   int edad=Integer.parseInt(request.getParameter("edad"));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido tus datos son:</h1>
        <ul>
            <li>Nombre: <%=nombre%></li>
            <li>Correo:<%=correo%></li>
            <li>Edad:<%=edad%></li>
        </ul>
        <a href="index.jsp">Volver</a>
    </body>
</html>
