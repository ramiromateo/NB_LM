<%-- 
    Document   : verSistema
    Created on : 09-jul-2018, 1:12:41
    Author     : José
--%>

<%@page import="WebService.CargaMasiva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Viendo Sistem</title>
    </head>
    <body>
        <h1>Viendo sistema General</h1>
        
        <%CargaMasiva.estantes.escribirSistema();%>
        <img src="files/sistem.png">

    </body>
</html>
