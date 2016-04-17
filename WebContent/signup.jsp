<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="description" content="">
		<meta name="author" content="compBuilder Team">
		<title>Sign Up </title>
		
		<link rel="shortcut icon" href="/favicon.ico">
		<link rel="apple-touch-icon" href="/apple-touch-icon.png">
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://bootswatch.com/united/bootstrap.min.css">	
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" 
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>		
		<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
	</head>
	
	<body>
		<header>
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">CompBuilder</a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search">
							</div>
							<button type="submit" class="btn btn-default">
								Submit
							</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#"><span class="glyphicon glyphicon-user"></span>Sign In / Sign Up</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>Shop</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="#">Customer Service</a></li>
						</ul>
					</div><!-- /.navbar-collapse -->
				</div><!-- /.container-fluid -->
			</nav>
		</header>
		
		<div class="container">
			<div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
				<div class="panel panel-info">
					<div class="panel-heading">
						<div class="panel-title"> CompBuilder Account Sign In </div>
						<div style="float:right; position:relative; top:-20px"><a href="#">Forgot password?</a></div>
					</div>
					<div class="panel-body">
						<div style="display:block" class="alert alert-danger col-sm-12">
							<div style="color: red;"> ${userError} </div>
							<div style="color: red;"> ${passwordError} </div>
						</div>
						
						<form id="loginform" class="form-horizontal" role="form" action="SqlGatewayServlet" method="post">
							<input type="hidden" name="action" value="login">
							
							<div style="margin-bottom: 25px" class="input-group">
                            	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="Email Address" required>                                        
                            </div>
                            
                            <div style="margin-bottom: 25px" class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="login-password" type="password" class="form-control" name="password" placeholder="Password" required>
                            </div>
                            
                            <div style="margin-top:10px" class="form-group">
								<div class="col-sm-12 controls">
                                	<button type="submit" class="btn btn-success">Login</button>
                                </div>
                            </div>
                             <div class="form-group">
                             	<div class="col-md-12 control">
                                	<div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" > Don't have an account! 
                                        <a href="#" onClick="$('#loginbox').hide(); $('#signupbox').show();">Sign Up Here</a>
                                    </div>
                                </div>
                             </div> 
						</form>
					</div>	
				</div>
			</div>
				
			<div id="signupbox" style="display:none; margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
				<div class="panel panel-info">
					<div class="panel-heading">
						<div class="panel-title"> Account Sign Up </div>
						<div style="float:right; font-size: 85%; position:relative; top:-20px">
							<a id="signinlink" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show();">Sign In</a>
						</div>
					</div>
					<div class="panel-body">
						<form id="signupform" class="form-horizontal" role="form" action="SqlGatewayServlet" method="post">
							<input type="hidden" name="action" value="signup">
							
							<div id="signupalert" style="display:block" class="alert alert-danger">
								<p> Error! </p>
								<span></span>
							</div>
							
							<div class="form-group">
								<label for="email" class="col-md-3 control-label"> Email Address </label>
								<div class="col-md-9">
									<input type="text" class="form-control" name="username" placeholder="Email Address">
								</div>
							</div>
							
							<div class="form-group">
								<label for="firstname" class="col-md-3 control-label"> First Name </label>
								<div class="col-md-9">
									<input type="text" class="form-control" name="firstname" placeholder="First Name">
								</div>
							</div>
							
							<div class="form-group">
								<label for="lastname" class="col-md-3 control-label"> Last Name </label>
								<div class="col-md-9">
									<input type="text" class="form-control" name="lastname" placeholder="Last Name">
								</div>
							</div>
							
							<div class="form-group">
								<label for="password" class="col-md-3 control-label"> Password </label>
								<div class="col-md-9">
									<input type="password" class="form-control" name="passwd" placeholder="Password">
								</div>
							</div>
							
							<div class="form-group">
								<label for="reenter-password" class="col-md-3 control-label"> Re-enter Password </label>
								<div class="col-md-9">
									<input type="password" class="form-control" name="passwconfirm" placeholder="Re-enter Password">
								</div>
							</div>
							
							<div class="form-group">
								<div class="col-md-offset-3 col-md-9">
									<button id="btn-signup" type="submit" class="btn btn-info">
										<i class="icon-hand-right"></i> &nbsp Sign Up  
									</button>
								</div>
							</div>
							
						</form>
					</div>
				</div>
			</div>

		</div>
	</body>	
</html>			
			
			
			
			
			
			
			
			
			
			
			
			
			