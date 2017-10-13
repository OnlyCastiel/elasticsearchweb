<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.js" type="text/javascript" charset="UTF-8"></script>
<title>Insert title here</title>
</head>
    <title>Apache Tomcat WebSocket Examples: Chat</title>
<body>
	<div>
		<input type="button" id="btnConnection" value="连接" />
		<input type="button" id="btnClose" value="关闭" />
		<input type="button" id="btnSend" value="发送" />
		<input type="button" id="confirm" value="确认功能">
	</div>
	

<script src="<%=request.getContextPath()%>/js/chat.js" type="text/javascript" charset="UTF-8"></script>
	
</body>
</html>