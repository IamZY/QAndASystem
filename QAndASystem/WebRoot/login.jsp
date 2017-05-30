<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>login</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	<script type="text/javascript" src="myjs.js"></script>
  	<script type="text/javascript">
  		
  		function register(){
  			window.location.href="register.jsp";
  		}
  		
  		function showlogin(){
  			console.log("showlogin....");
  			var username = document.getElementById("username").value;
  			var userMsg = document.getElementById("userMsg");
  			
  			if(username == ""){
  				userMsg.innerHTML="用户名不能为空！";
  				userMsg.style.display="inline";	
  			}else{
  				userMsg.innerHTML="";
  			}
  			
  		}
  		
  		
  		function showPassword(){
  			console.log("showPassword...");
  			
  			var pwd = document.getElementById("pwd").value;
  			var pwdMsg = document.getElementById("pwdMsg");
  			
  			if(pwd == ""){
  				pwdMsg.innerHTML="密码不能为空！";
  				pwdMsg.style.display="inline";	
  			}else{
  				pwdMsg.innerHTML="";
  			}
  			
  			
  			
  		}
  	
  	
  	</script>
  
  
  <body>
  		<h1 style="color: red">课堂问答系统</h1>
  		<h2>用户登录</h2>
  		<form action="LoginAction" method="post">
  		
  			用户名:<input type="text" name="student.username" id="username" onblur="showlogin()"/>
  			<span style="color: red" id="userMsg"></span>
  			<br>
  			密码:<input type="password" id="pwd" name="student.password" onblur="showPassword()">
  			<span style="color: red" id="pwdMsg"></span>
  			<br>
  			<input type="submit" value="登录"/>
  			<input type="button" id="button" value="注册" onclick="register()"/>
  		</form>
   		
  </body>
</html>
