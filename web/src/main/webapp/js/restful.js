$("#get").click(function(){
	$.ajax({
        type: "GET",
        url: "/MavenWebTwo/student/2011221102110106",
        async:"false",
//        data: {username:$("#username").val(), content:$("#content").val()},
        dataType: "json",
        success: function(data){
        	alert(JSON.stringify(data));
        },
		error: function(){
			alert("get请求出错");
		}
    });
});

$("#put").click(function(){
	$.ajax({
        type: "PUT",
        url: "/MavenWebTwo/student",
        async:"false",
//        data: {username:$("#username").val(), content:$("#content").val()},
        dataType: "text",
        scriptCharset: 'utf-8',
        success: function(data){
        	alert(data);
        }
    });
});


$("#delete").click(function(){
	$.ajax({
        type: "DELETE",
        url: "/MavenWebTwo/student/刘佳丽",
        async:"false",
//        data: {username:$("#username").val(), content:$("#content").val()},
        dataType: "text",
        success: function(data){
        	alert(data);
        }
    });
});


$("#post").click(function(){
	$.ajax({
        type: "POST",
        url: "/MavenWebTwo/student",
        async:"false",
//        data: {username:$("#username").val(), content:$("#content").val()},
        dataType: "text",
        success: function(data){
        	alert(data);
        }
    });
});