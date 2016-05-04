<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="<c:url value="/resources/js/jquery-2.1.3.min.js" />" ></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  Service List </P>
<c:forEach items="${serviceList}" var="service">
	<button id="${service.shortcut }" class="btn-service"> ${service.set_name } ${service.shortcut } </button><br/>
</c:forEach>
</body>
<script>
	$(function(){
		$('.btn-service').click(function(){
			ajaxGetTicket(this.id);
		});
	});
	function ajaxGetTicket(shortcut){
		 $.ajax({
			  url : "${pageContext.request.contextPath }/rgtn?shortcut="+shortcut,
			  type : "GET",
			  error : function(){
				  console.log("ERROR : ");
			  },
			  success : function(data){
				  console.log("SUCCESS : ");
					
			  }
		  });
	}
</script>
</html>
