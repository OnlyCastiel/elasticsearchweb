<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.js" type="text/javascript" charset="UTF-8"></script>
<title>Apache Tomcat WebSocket Examples: Chat</title>
<style type="text/css">
input#chat
{
width:
410px
}
#console-container {
	width: 400px;
}
#console {
	border: 1px solid #CCCCCC;
	border-right-color: #999999;
	border-bottom-color: #999999;
	height: 170px;
	overflow-y: scroll;
	padding: 5px;
	width: 100%;
}
#console p {
	padding: 0;
	margin: 0;
}
</style>
</head>

<body>
<div class="noscript"><h2 style="color: #ff0000">Seems your browser doesn't support Javascript! Websockets rely on Javascript being enabled. Please enable
    Javascript and reload this page!</h2></div>
<div>
    <p>
        <input type="text" placeholder="type and press enter to chat" id="chat" />
    </p>
    <div id="console-container">
        <div id="console"/></div>
    </div>
</div>
<script src="<%=request.getContextPath()%>/js/webChat.js" type="application/javascript" charset="UTF-8"></script>
</body>
</html>