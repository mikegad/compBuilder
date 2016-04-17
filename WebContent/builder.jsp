<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">

		<!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame
		Remove this if you use the .htaccess -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>CompBuilder</title>		<meta name="description" content="">
		<meta name="author" content="Sam Rodens">

		<meta name="viewport" content="width=device-width; initial-scale=1.0">

		<!-- Replace favicon.ico & apple-touch-icon.png in the root of your domain and delete these references -->
		<link rel="shortcut icon" href="/favicon.ico">
		<link rel="apple-touch-icon" href="/apple-touch-icon.png">
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://bootswatch.com/united/bootstrap.min.css">
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
		
		<link rel="stylesheet" href="builder.css">

		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</head>
<body>
<div>
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
								<ul class="nav navbar-nav">
									<li>
										<a href="#">Login or Register</a>
									</li>

								</ul>
								<li>
									<a href="cart.jsp"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
								</li>
								<li>
									<a href="#">Order History</span></a>
								</li>
								<li>
									<a href="#">Customer Service</span></a>
								</li>
							</ul>
						</div><!-- /.navbar-collapse -->
					</div><!-- /.container-fluid -->
				</nav>
			</header>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-6">
            <img src="img/computer-154114_1280.png" height="620" width="620" class="img-responsive center-block">
        </div>
        <div class="col-md-6">
            <form action="build" method="post">
               <fieldset>
                  <legend>CPU</legend>
                  <input type="radio" name="cpustatus" value="cpu1">1GHz - $499.99
                  <input type="radio" name="cpustatus" value="cpu2">2GHz - $799.99
                  <input type="radio" name="cpustatus" value="cpu3">3GHz - $999.99
               </fieldset>
               
               <fieldset>
                  <legend>Hard Drive</legend>
                  <input type="radio" name="harddrivestatus" value="hardDrive1">240GB - $199.99
                  <input type="radio" name="harddrivestatus" value="hardDrive2">500GB - $399.99
               </fieldset>
               
               <fieldset>
                  <legend>Memory</legend>
                  <input type="radio" name="memorystatus" value="memory1">4GB - $199.99
                  <input type="radio" name="memorystatus" value="memory2">8GB - $399.99
                  <input type="radio" name="memorystatus" value="memory3">16GB - $599.99
               </fieldset>
               
               <br><br><br>
             <button type="submit">Compute PC Costs</button>
             
            </form>
            
        </div>
    </div>
</div>

<script>
   var myValue = $(this).attr("data-image-attribute");
   alert(myValue);
</script>

</body>
</html>