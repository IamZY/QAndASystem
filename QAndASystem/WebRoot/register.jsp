<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>register</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="style.css">

  </head>
  
  <body>
		<h2>用户注册</h2>
	
	<br>	
	<div id="main">	
			<img src="pics/home_36.jpg">带<font style="color:red">*</font>
				号的表示为必填的项目，请及时完善个人信息，以便找回密码<br>
	<br>

		<form action="RegisterAction" method="post">
				 	
		 	<table>
		 		
		 		<tr>
		 			<td style="text-align:right">用户名：&nbsp;</td>
		 			<td>
		 				<input type="text" name="student.username"/>
		 				<font style="color:red">*</font>请填写您的用户名
		 			<td>
		 			
		 		<tr>

		 		<tr>
		 			<td style="text-align:right">密码：&nbsp;</td>
		 			<td>
			 			<input type="password" name="student.password"/>
			 			<font style="color:red">*</font>请用英文字母或数字或下划线
		 			<td>
		 			
		 		<tr>
		 		
		 		<tr>
		 			<td style="text-align:right">E-mail：&nbsp;</td>
		 			<td>
			 			<input type="text" name="student.email"/>
			 			<font style="color:red">*</font>请输入您的电子邮箱地址，便于接受注册信息和找回密码
		 			<td>
		 			
		 		<tr>
		 	
		 		
		 		
		 		<tr>
		 			<td style="text-align:right">所在院校：&nbsp;</td>
		 			<td>
		 				<input type="text" name="student.school"/>
		 			<td>
		 			
		 		<tr>
		 		
		 		
		 		<tr>
		 			<td style="text-align:right">性别：&nbsp;</td>
		 			<td>
		 				<input type="radio" checked="checked" name="student.sex" value="男"/>男
			 			<input type="radio" name="student.sex" value="女"/>女
		 			<td>
		 		<tr>
		 		
		 		
		 		<tr>
		 			<td style="text-align:right">&nbsp;</td>
		 			<td>
		 				<input type="submit" value="注册"/>	
		 			<td>
		 		<tr>
		 		
		 		
		 	</table>
		 				
		 	</form>
		 	
		</div>			
		
	</body>
</html>
