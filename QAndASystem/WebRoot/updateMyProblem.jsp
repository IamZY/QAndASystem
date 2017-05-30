<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>updateMyProblem</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  		<%
  			String question = request.getParameter("question");
  			question = new String(question.getBytes("ISO8859-1"),"UTF-8");
  		 %>
  
  
  
  <body>
  		<h1 style="color: red">课堂问答系统</h1>
    	<form action="updateMyProAction" method="post">
    		<input type="hidden" name="sid" value="<%=request.getParameter("sid") %>"/> 
    		<input type="hidden" name="pro.pid" value="<%=request.getParameter("pid") %>"/> 
    		原本的问题<input type="text" name="problem" value="<%=question %>" readonly="readonly"/><br>
    		修改后的问题<input type="text" name="pro.question"/><br>
    		<input type="submit" value="提交"/>
    	</form>
  </body>
</html>
