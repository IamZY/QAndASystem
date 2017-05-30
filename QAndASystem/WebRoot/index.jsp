<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="style.css">
  </head>
  
  <body>
  		
  		
    	<h1 style="color: red">课堂问答系统</h1>
    	
    	<!-- 
    	[<a href="#">登录</a>]&nbsp;[<a href="<%=basePath%>register.jsp">注册</a>]
    	 -->
    	你好！<%=session.getAttribute("username") %>   [<a href="findMyProblemAction.action?sid=<%=session.getAttribute("sid") %>">我的信息</a>]
    	   
    	<a href="addProblem.jsp?sid=${sid }&&username=<%=session.getAttribute("username") %>">提出问题</a>  
   		<a href="login.jsp">注销</a><br>
    	<form action="findProblemAction" method="post">
    		搜索问题<input type="text" name="problem"/>   		
    		<input type="submit" value="搜素">
    	</form>
    	 	
    	<br>	
	<div id="main">	
			<img src="pics/home_36.jpg"><font color="red">本系统旨在提供学习交流，不得散布不良信息！</font>
				<br>
				 	
		 	<table>
		 		<tr>
		 			<td style="text-align:right">&nbsp;</td>
		 			<td>
			 			<h2>学科</h2>
			 		</td>		 			 		
		 		</tr>
		 		
		 		<s:iterator id="s" value="subList">
		 			<tr>
			 			<td style="text-align:right">&nbsp;</td>
			 			<td>
				 			<h2><a href="findSubjectAction.action?subno=${s.subno }&&sid=${sid }&&username=${student.username }">${s.subname }</a></h2>
				 		</td>		 			 		
		 			</tr>
		 		
		 		</s:iterator>
		 		
		 		
		 	
		 	</table>
		 	
		 	
		 	
		</div>	    	
    	<s:debug></s:debug>
    	
  </body>
</html>
