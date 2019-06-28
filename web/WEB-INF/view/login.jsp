<%--
  Created by IntelliJ IDEA.
  User: mailz
  Date: 2019/6/24
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <title>登录界面</title>
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<form id="form1" class="well"
      method="post" action="/login">
    <h3>用户入口<h4><font color="#8b0000">${msg}</font> </h4></h3>
    <div class=" input-group input-group-md">
              <span class="input-group-addon" id="sizing-addon1"><i
                      class="glyphicon glyphicon-user" ></i></span>
        <input id="userName" type="text" class="form-control" name="userName"/>

    </div>
    <br />
    <div class="input-group input-group-md">
              <span class="input-group-addon" id="sizing-addon1"><i
                      class="glyphicon glyphicon-lock"></i></span>
        <input type="password" id="password" class="form-control" name="password"/>
    </div>
    <br/>
    <button type="submit" id="bn" class="btn btn-success btn-block">登录</button>
    <a class="btn btn-sm btn-white btn-block" style="text-align: right;" th:href="@{register}" href="register.html"><h6>还没有账户？前往注册</h6></a>
</form>
</body>
</html>