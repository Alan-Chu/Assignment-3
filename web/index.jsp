<%-- 
    Document   : index
    Created on : 2018-10-27, 0:17:21
    Author     : ALAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Scores</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/whole_css.css">
        <script src="${pageContext.request.contextPath}/js/index_js.js"></script>
    </head>
    <body style="text-align: center;">
        <h1>Student Scores</h1>
        <h4>You can <strong>insert</strong>, <strong>select</strong> and <strong>update</strong> student scores here</h4>
        <hr>
	<div class="col-md-4 panel panel-default">
            <div class="panel-heading">
                Insert New Score
            </div>
            <div class="panel-body">
                <form method="post" action="Servlet" onsubmit="return checkInsert()">
                    <table class="table" style="border-collapse:separate; border-spacing:0px 20px;">
                        <tr>
                            <td>Student Name </td>
                            <td><input type="text" name="insert_name" id="insert_student_name"></td>
                        </tr>
                        <tr>
                            <td>Score</td>
                            <td><input type="text" name="insert_score" id="insert_student_score"></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input onclick="" class="btn btn-primary" type="submit" value="Insert" name="insert_submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
	</div>
<!--        <div class="col-md-1"></div>-->
        <div class="col-md-4 panel panel-default">
            <div class="panel-heading">
                Select a Particular Score
            </div>
            <div class="panel-body">
                <form method="post" action="Servlet" onsubmit="return checkSelect()">
                    <table class="table">
                        <tr>
                            <td>Student Name</td>
                            <td><input type="text" name="select_name" id="select_student_name"></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input onclick="" class="btn btn-primary" type="submit" value="Select" name="select_submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
<!--        <div class="col-md-1"></div>-->
        <div class="col-md-4 panel panel-default">
            <div class="panel-heading">
                Update Score
            </div>
            <div class="panel-body">
                <form method="post" action="Servlet" onsubmit="return checkUpdate()">
                    <table class="table" style="border-collapse:separate; border-spacing:0px 20px;">
                        <tr>
                            <td>Student Name </td>
                            <td><input type="text" name="update_name" id="update_student_name"></td>
                        </tr>
                        <tr>
                            <td>New Score</td>
                            <td><input type="text" name="update_score" id="update_student_score"></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input onclick="" class="btn btn-primary" type="submit" value="Update" name="update_submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    <footer>Alan Chu@2018</footer>
    </body>
</html>
