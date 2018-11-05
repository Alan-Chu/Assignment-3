<%-- 
    Document   : update_success
    Created on : 2018-10-28, 16:35:21
    Author     : ALAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/whole_css.css">
        <title>Update Success</title>
        <jsp:useBean id="Student" class="bean.Student" scope="session" />
    </head>
    <body>
        <h1>Update Result</h1>
        <hr>
        <p>Congratulations! <jsp:getProperty name="Student" property="name" /> with 
            <jsp:getProperty name="Student" property="score" /> points has been successfully recorded.
        </p>
        <a href="index.jsp">BACK</a>
    </body>
</html>
