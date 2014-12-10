<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/flat-ui.min.css">
	<link rel="stylesheet" type="text/css" href="css/Login.css">

  </head>
  
  <body>
    <div class="container">
    	<article>
    		<h1>Hello, world!</h1>
    	</article>
    	<nav>
    		<!-- login -->
    		<!-- btn -->
    		<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-sm">Login </button>
    		<!-- window -->
    		<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
    			<div class="modal-dialog modal-sm">
    				<div class="modal-content">
    					<div class="modal-header">
    						<buttton type="button" class="close" data-dismiss="modal">
    							<span aria-hidden="true">×</span>
    							<span class="sr-only">Close</span>
    						</buttton>
    						<h4 class="modal-title" id="mySmallModalLabel">Login</h4>
    					</div><!-- /.modal header -->
    					
    					
	    				<div class="modal-body">
	    					<form method="post">
		    					<div class="form-group">
		    						<input name="username" type="text" placeholder="Email" class="form-control"/>
		    					</div>
		    					<div class="form-group">
		    						<input name="pwd" type="password" placeholder="Password" class="form-control" />
		    					</div>
		    					<div class="form-group">
		    						<label class="col-lg-9"></label>
			    					<button id="btn-sub" class="btn btn-embossed btn-primary btn-right">
									  Login
									</button>
		    					</div>
	    					</form><!-- /. form -->
	    				</div><!-- /.modal body -->
    				</div><!-- /.model content -->
    				
    			</div>
			</div>
    	</nav>
    	<script type="text/javascript" src="js/jquery.min.js"></script>
    	<script type="text/javascript" src="js/flat-ui.min.js"></script>
    	<script src="js/Login.js"></script>
    </div>
    
  </body>
</html>
