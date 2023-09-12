

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Repaso</h1>
        
        <!--Realizar un formulario que envie datos-->
        <p>Esto es un formulario entre dos servlets</p>
        <form action="salida.jsp" method="POST">
            <label >Nombre:</label>
            <input type="text" name="nombre" />
              <br>
            <label>Correo:</label>
            <input type="text" name="correo" value=""/>
            <br>
            <label>Edad:</label>
            <input type="text" name="edad" value=""/>
            <br><!-- comment -->
            <input type="submit" value="Enviar Datos"><!-- comment -->
            
            
        </form>
    </body>
</html>
