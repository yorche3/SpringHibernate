<%-- 
    Document   : login
    Created on : 17/10/2017, 06:08:47 PM
    Author     : yorch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        <table>
            <tr>
                <th>
                    ID
                </th>
                <th>
                    Correo
                </th>
            </tr>
            
        <c:forEach var="user" items="${users}">
            <tr>
                <td>
                    <c:out value="${user.getId()}"></c:out>
                </td>
                <td>
                   ${user.getCorreo()}
                </td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
