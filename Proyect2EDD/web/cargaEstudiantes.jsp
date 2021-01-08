<%-- 
    Document   : cargaEstudiantes
    Created on : 10-jul-2018, 21:53:26
    Author     : José
--%>

<%@page import="WebService.CargaMasiva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>carga</title>
    </head>
    <body>
        <h1>Cargando Alumnos!</h1>
        <% 
            String archivourl="C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\EST.csv";
            new CargaMasiva(archivourl,2);
        %>

    </body>
</html>
