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
    账号：<input type="text" id="username" name="username" placeholder="2~4个汉字" onchange="accountCheck()">
    密码：<input type="password" id="password" name="password" placeholder="6~12位数字或密码" onchange="pwdCheck()">
    邮箱：<input type="text" id="email" placeholder="请输入邮箱" onchange="emailCheck()">
    <input id="submit" type="submit" value="注册" />
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    var usernamePattern = /^[\u4e00-\u9fa5]{2,4}$/;
    var passwordPattern = /^[a-zA-Z0-9]{6,22}$/;
    var emailPattern = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;

    function accountCheck(){
        var value = document.getElementById("username").value;
        if(!usernamePattern.test(value)){
            alert("用户名格式错误，请重试输入");
            document.getElementById("submit").disabled=true;
            return;
        }else{
            document.getElementById("submit").disabled=false;
        }

        $.ajax({
            url:"http://localhost:8080/order/checkUsername",
            type:"post",
            data:'username='+value,
            success:function (obj) {
                if(obj.flag){
                    alert("用户名已存在，请重试输入");
                    document.getElementById("submit").disabled=true;
                }else{
                    document.getElementById("submit").disabled=false;
                }
            }
        });
    }

    function pwdCheck() {
        var value = document.getElementById("password").value;
        if(!passwordPattern.test(value)){
            alert("密码格式错误，请重新输入");
            document.getElementById("submit").disabled=true;
        }else{
            document.getElementById("submit").disabled=false;
        }
    }

    function emailCheck() {
        var value = document.getElementById("email").value;
        if(!emailPattern.test(value)){
            alert("邮箱格式错误，请重新输入");
            document.getElementById("submit").disabled=true;
        }else{
            document.getElementById("submit").disabled=false;
        }
    }
</script>
</html>