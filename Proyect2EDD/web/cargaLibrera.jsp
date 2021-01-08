<%-- 
    Document   : cargaLibrera
    Created on : 10-jul-2018, 23:07:13
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
        <h1>Carga de Librera!</h1>
        <% 
            String archivourl="C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\GEN.csv";
            new CargaMasiva(archivourl,3);
        %>
    </body>
</html>
