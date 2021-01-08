<%-- 
    Document   : verEmpleados
    Created on : 10-jul-2018, 20:46:20
    Author     : José
--%>

<%@page import="WebService.CargaMasiva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>viendo</title>
    </head>
    <body>
        <h1>Reporte de Empleados</h1>
        <%CargaMasiva.ar.dibujarDot();%>
        <img src="files/arbolbin.png">
    </body>
</html>
