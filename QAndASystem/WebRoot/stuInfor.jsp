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
    
    <title>stuInfor</title>
    
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
   				<td>我的问题</td>
   				<td>问题的答案</td>
   				<td>删除问题</td>
   				<td>修改问题</td>
   			</tr>
   			
   			
   			<s:iterator id="m" value="myProList">
   				<tr>
   					<td>${m.question }</td>
    				<td>${m.answer }</td>
    				<td><a href="delMyProAction.action?pro.pid=${m.pid }&&sid=${sid }">删除</a></td>
    				<td><a href="updateMyProblem.jsp?pid=${m.pid }&&question=${m.question }&&sid=${sid }">修改</a></td>
   				</tr>
   			</s:iterator>
   			
   			
   		
   		</table>
   		
   		<a href="SubjectAction?student.sid=<%=session.getAttribute("sid") %>&&student.username=<%=session.getAttribute("username") %>">返回上级</a>
   			
  </body>
</html>
