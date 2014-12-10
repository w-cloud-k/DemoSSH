<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Management.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/flat-ui.min.css">

  </head>
  
  <body>
  		<div class="container">
  			<article>
  				<h1>${sessionScope.student.username } Login Success</h1>
  			</article>
  			<section class="dataContainer">
	  			<nav class="navbar navbar-inverse" role="navigation">
	  				<button type="button" class="btn btn-default navbar-btn">Sign in</button>
	  				<button type="button" class="btn btn-default navbar-btn">Sign in</button>
	  				<button type="button" class="btn btn-default navbar-btn">Sign in</button>
				</nav>
  				<table class="table table-hover">
				  <thead>
				  	<tr>
				  		<th>#</th>
				  		<th>name</th>
				  		<th>gender</th>
				  		<th>birthday</th>
				  		<th>born</th>
				  	</tr>
				  </thead>
				  <tbody>
				  	<tr>
				  		<th>1</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>2</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>3</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>4</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>5</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>6</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>7</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>8</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>9</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	<tr>
				  		<th>10</th>
				  		<th>susan</th>
				  		<th>woman</th>
				  		<th>1999-03-02</th>
				  		<th>losanger</th>
				  	</tr>
				  	
				  </tbody>
				</table>
  			</section>
  		</div>
 	 	<script type="text/javascript" src="js/jquery.min.js"></script>
    	<script type="text/javascript" src="js/flat-ui.min.js"></script>
    	<script src="js/Login.js"></script>
  </body>
</html>
