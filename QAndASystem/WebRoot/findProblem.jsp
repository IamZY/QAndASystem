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
    
    <title>findProblem</title>
    
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
    	<table border="1px">
   			<tr>
   				<td>搜索到的的问题</td>
   				<td>问题的答案</td>
   			</tr>
   			
   			
   			<s:iterator id="p" value="probleList">
   				<tr>
   					<td>${p.question }</td>
    				<td>${p.answer }</td>
   				</tr>
   			</s:iterator>
   	
   		</table>
   		
   		<a href="SubjectAction?student.sid=<%=session.getAttribute("sid") %>&&student.username=<%=session.getAttribute("username") %>">返回上级</a>
  </body>
</html>
