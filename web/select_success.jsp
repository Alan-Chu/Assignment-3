<%-- 
    Document   : select_success
    Created on : 2018-10-28, 16:08:56
    Author     : ALAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Success</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/whole_css.css">
        <jsp:useBean id="Student" class="bean.Student" scope="session" />
    </head>
    <body>
        <h1>Select Result</h1>
        <p>
            Score for <jsp:getProperty name="Student" property="name" /> is 
            <jsp:getProperty name="Student" property="score" />
        </p>
        <a href="index.jsp">BACK</a>
    </body>
</html>
