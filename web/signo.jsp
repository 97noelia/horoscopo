<%-- 
    Document   : signo
    Created on : 25-feb-2020, 22:11:56
    Author     : Noelia
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horóscopo</title>
    </head>
    <body>
        <div>
            <%
                ArrayList<String> dias = (ArrayList<String>) request.getAttribute("dias");
                ArrayList<String> meses = (ArrayList<String>) request.getAttribute("meses");
                String nombre = (String) request.getAttribute("nombre");
                if (nombre == null) {
                    nombre = "";
                }
                String dia = (String) request.getAttribute("dia");
                if (dia == null) {
                    dia = "1";
                }
                String mes = (String) request.getAttribute("mes");
                if (mes == null) {
                    mes = "1";
                }
                String resultado = (String) request.getAttribute("resultado");
                if(resultado == null){
                    resultado = "";
                }
            %>
            <h1>ZOODÍACO</h1>
            <form method="post">
                Nombre: <input type="text" name="nombre" value="<%=nombre%>">
                <br><br>
                Día de Nacimiento:  <select name="dia">
                    <%for (int j = 0; j < dias.size(); j++) {%>
                    <% if (dia.equals(dias.get(j))) {%>
                    <option value="<%= dias.get(j)%>" selected="selected"><%= dias.get(j)%></option>
                    <%} else {%>
                    <option value="<%= dias.get(j)%>"><%= dias.get(j)%></option>
                    <%}%>
                    <%}%>
                </select>
                <br><br>
                Mes de Nacimiento:  <select name="mes">
                    <%for (int j = 0; j < meses.size(); j++) {%>
                    <% if (mes.equals(meses.get(j))) {%>
                    <option value="<%= meses.get(j)%>" selected="selected"><%= meses.get(j)%></option>
                    <%} else {%>
                    <option value="<%= meses.get(j)%>"><%= meses.get(j)%></option>
                    <%}%>
                    <%}%>
                </select>
                <br><br>
                <input type="submit" value="signo">
            </form>
        </div>
        <div id="resultado">
            <%=resultado%>
        </div>
    </body>
</html>
