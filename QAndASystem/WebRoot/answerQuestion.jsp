<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>answerQuestion</title>
    
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
  		<h1>问题提交</h1>	
    	<form action="updateQuestionAction" method="post">
    		<input type="hidden" name="pro.pid" value="<%=request.getParameter("pid") %>"/>
    		<input type="hidden" name="pro.sid" value="<%=request.getParameter("sid") %>"/>
    		<input type="hidden" name="student.username" value="<%=request.getParameter("username") %>"/>    		
			问题:<br>
			<input type="text" name="pro.question" value="<%=question %>" readonly="readonly"/>
    		<br>
    		答案:<br>
    		<input type="text" name="pro.answer"/>
    		<br>
    		<input type="submit" value="提交"/>
    	</form>
  </body>
</html>
