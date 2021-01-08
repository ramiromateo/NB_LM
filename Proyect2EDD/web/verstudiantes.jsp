<%-- 
    Document   : verstudiantes
    Created on : 08-jul-2018, 15:15:06
    Author     : José
--%>

<%@page import="WebService.Estudiante"%>
<%@page import="WebService.CargaMasiva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>viendo</title>
    </head>
    <body>
        <h1>Reporte de Estudiantes</h1>
        <%CargaMasiva.listaEstudiantes.imprimirEstudiantes();%>
        <img src="files/Estu.png">

    </body>
</html>
