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
<body style="background-color: whiteSmoke;padding-top: 100px">
<div class="container">
    <form class="form-horizontal" style="background-color: #ffffff">
        <div class="control-group">
            <label class="control-label" for="inputEmail">Email</label>

            <div class="controls">
                <input type="text" id="inputEmail" placeholder="Email">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputPassword">Password</label>

            <div class="controls">
                <input type="password" id="inputPassword" placeholder="Password">
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <label class="checkbox">
                    <input type="checkbox"> Remember me
                </label>
                <button type="submit" class="btn">Sign in</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>