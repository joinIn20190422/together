<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
</head>
<body>
<form action="" method="post">
    账号：<input type="text" id="username" name="username" placeholder="请输入用户名" onchange="accountCheck()">
    密码：<input type="password" id="password" name="password" placeholder="请输入密码" onchange="pwdCheck()">
    邮箱：<input type="text" id="email" placeholder="请输入邮箱" onchange="emailCheck()">
    <input type="submit" value="注册" />
</form>
</body>
<script type="text/javascript">
    var usernamePattern = /^\d{5,12}$/;
    var passwordPattern = /^[a-zA-Z0-9]{6,22}$/;
    var emailPattern = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;

    function accountCheck(){
        var value = this.value;
        if(!usernamePattern.test(value)){
            alert("用户名格式错误或已存在，请重试输入");
        }
    }

    function pwdCheck() {
        var value = this.value;
        if(!passwordPattern.test(value)){
            alert("密码格式错误，请重新输入");
        }
    }

    function emailCheck() {
        var value = this.value;
        if(!emailPattern.test(value)){
            alert("邮箱格式错误，请重新输入");
        }
    }
</script>
</html>