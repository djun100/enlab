<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <link id="mainCss" type="text/css" rel="stylesheet" href="${ctx}/statix/bootstrap/css/bootstrap.css"/>
    <script src="${ctx}/statix/bootstrap/js/bootstrap.js"></script>
</head>
<body style="background-color: whiteSmoke;padding-top: 100px;font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;font-size: 14px;line-height: 20px;color: #333;">
<div class="container">

    <form action="login.action" method="post"
          style="max-width: 300px;margin: 0 auto;  border: 1px solid #E5E5E5;background-color: white;-webkit-border-radius: 5px;box-shadow: 0 1px 2px rgba(0, 0, 0, .05);padding: 19px 29px 29px;">

        <h2>Please sing in</h2>


        <input type="text" id="userName" name="userName" placeholder="User Name"
               style="font-size: 16px;height: auto;margin-bottom: 15px;padding: 7px 9px; width: 100%">

        <input type="password" id="password" name="password" placeholder="Password"
               style="font-size: 16px;height: auto;margin-bottom: 15px;padding: 7px 9px; width: 100%">

        <label class="checkbox">
            <input type="checkbox" name="rememberMe"> Remember Me</input>
        </label>
        <button type="submit" class="btn btn-primary">Sign in</button>

    </form>


</div>

</body>
</html>