<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>addProblem</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  		<h1 style="color: red">课堂问答系统</h1>
    	<form action="addAction" method="post">
    		<input type="hidden" name="pro.sid" value="<%=request.getParameter("sid") %>"/>
			<input type="hidden" name="username" value="<%=request.getParameter("username") %>"/>
			你要提的问题<input type="text" name="pro.question"/> 				   		
						<select name="pro.subname">
							<option value="数学">数学</option>
							<option value="语文">语文</option>
							<option value="英语">英语</option>
							<option value="生物">生物</option>
							<option value="化学">化学</option>
							<option value="历史">历史</option>
						</select><br>    	
    		<input type="submit" value="提交">
    	</form>
  </body>
</html>
