<%-- 
    Document   : success
    Created on : 2018-10-27, 0:46:54
    Author     : ALAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Success</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/whole_css.css">
        <jsp:useBean id="Student" class="bean.Student" scope="session" />
    </head>
    <%--<jsp:getProperty name="Student" property="name" />--%>
    <body>
        <h1>Insert Result</h1>
        <hr>
        <p>Congratulations! <jsp:getProperty name="Student" property="name" /> with 
            <jsp:getProperty name="Student" property="score" /> points has been successfully recorded.
        </p>
        <a href="index.jsp">BACK</a>
    </body>
</html>
