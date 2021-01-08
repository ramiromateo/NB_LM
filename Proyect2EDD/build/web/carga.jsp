<%-- 
    Document   : carga
    Created on : 05-jul-2018, 23:13:08
    Author     : José
--%>


<%@page import="WebService.CargaMasiva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <meta charset="utf-8">
    <body>
        <h1>cargando empleados</h1>
        <% 
            String archivourl="C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\EMP.csv";
            new CargaMasiva(archivourl,1);
        %>
        
    </body>
</html>
