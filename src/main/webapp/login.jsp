<%--
  Created by IntelliJ IDEA.
  User: markstachowski
  Date: 2018-12-10
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<%! String username = request.getParam("username"); %>
<body>
<h1>Codeup Register Form</h1>

<h1><% username %></h1>
<form action="login.jsp" method="post">
    <table style="with: 50%">
        <tr>
            <td>UserName</td>
            <td><input type="text" name="username" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr></table>
    <input type="submit" value="Submit" /></form>
</body>
</html>
