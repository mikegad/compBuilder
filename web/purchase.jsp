<%@page import="com.compbuilder.model.CompBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Cart" class="com.compbuilder.model.Cart" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">

        <!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame
        Remove this if you use the .htaccess -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

        <title>CompBuilder</title>
        <meta name="description" content="">
        <meta name="author" content="Sam Rodens">

        <meta name="viewport" content="width=device-width; initial-scale=1.0">

        <!-- Replace favicon.ico & apple-touch-icon.png in the root of your domain and delete these references -->
        <link rel="shortcut icon" href="/favicon.ico">
        <link rel="apple-touch-icon" href="/apple-touch-icon.png">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://bootswatch.com/united/bootstrap.min.css">
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/redmond/jquery-ui.css">
       

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.1/jquery-ui.min.js"></script>

        <link rel="stylesheet" href="builder.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        
        <script>
         $(function() {
            $( "#expirationdate" ).datepicker({ minDate:0});
            
         });
      </script>

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
                            <a class="navbar-brand" href="/CompBuilder">CompBuilder</a>
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
                                    <a href="/CompBuilder/cart.jsp"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
                                </li>
                                <li>
                                    <a href="#">Order History</span></a>
                                </li>
                                <li>
                                    <a href="customerservice.html">Customer Service</span></a>
                                </li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>
            </header>
        </div>
  
  <br><br>
  
  <div class="container">
     <h1>Purchase Order</h1>
  </div>
     
  <form action = "finalize" class="form-horizontal" role="form" method="post">
      <div class="form-group">
         <label class="control-label col-sm-2" for="name">Name:</label>
          <div class="col-sm-10">
             <input type="text" class="form-control" name = "name" id="name" placeholder="Enter Full Name" required>
          </div>
          
          <label class="control-label col-sm-2" for="email">Email:</label>
          <div class="col-sm-10">
             <input type="email" class="form-control" name = "email" id="email" placeholder="Enter Email Address" required>
          </div>
      </div>
   
     <div class="container">
        <h2>Shipping Address</h2>
     </div>   
      <div class="form-group">
          <label class="control-label col-sm-2" for="street">Street:</label>
          <div class="col-sm-10">
              <input type="text" class="form-control" name="street" id="street" placeholder="Enter Street Address" required>
          </div>
      </div>
      
      <div class="form-group">
          <label class="control-label col-sm-2" for="city">City:</label>
          <div class="col-sm-10">
              <input type="text" class="form-control" name="city" id="city" placeholder="Enter City" required>
          </div>
      </div>
      
      <div class="form-group">
          <label class="control-label col-sm-2" for="billState">State:</label>
          <div class="col-sm-10">
              <select name="state" id="billState" required>
					<option value="AL" selected >AL</option>
					<option value="AK">AK</option>
					<option value="AZ">AZ</option>
					<option value="AR">AR</option>
					<option value="CA">CA</option>
					<option value="CO">CO</option>
					<option value="CT">CT</option>
					<option value="DE">DE</option>
					<option value="DC">DC</option>
					<option value="FL">FL</option>
					<option value="GA">GA</option>
					<option value="HI">HI</option>
					<option value="ID">ID</option>
					<option value="IL">IL</option>
					<option value="IN">IN</option>
					<option value="IA">IA</option>
					<option value="KS">KS</option>
					<option value="KY">KY</option>
					<option value="LA">LA</option>
					<option value="ME">ME</option>
					<option value="MD">MD</option>
					<option value="MA">MA</option>
					<option value="MI">MI</option>
					<option value="MN">MN</option>
					<option value="MS">MS</option>
					<option value="MO">MO</option>
					<option value="MT">MT</option>
					<option value="NE">NE</option>
					<option value="NV">NV</option>
					<option value="NH">NH</option>
					<option value="NJ">NJ</option>
					<option value="NM">NM</option>
					<option value="NY">NY</option>
					<option value="NC">NC</option>
					<option value="ND">ND</option>
					<option value="OH">OH</option>
					<option value="OK">OK</option>
					<option value="OR">OR</option>
					<option value="PA">PA</option>
					<option value="RI">RI</option>
					<option value="SC">SC</option>
					<option value="SD">SD</option>
					<option value="TN">TN</option>
					<option value="TX">TX</option>
					<option value="UT">UT</option>
					<option value="VT">VT</option>
					<option value="VA">VA</option>
					<option value="WA">WA</option>
					<option value="WV">WV</option>
					<option value="WI">WI</option>
					<option value="WY">WY</option>
				</select>
          </div>
      </div>
      
      <div class="form-group">
          <label class="control-label col-sm-2" for="city">Zip:</label>
          <div class="col-sm-10">
              <input type="text" class="form-control" name = "zip" id="billZip" pattern="\d{5}([\-]\d{4})?" placeholder="Enter City" required>
          </div>
      </div>
         
      <div class="container">
        <h2>Payment Information</h2>
     </div>
      
      
      <div class="container">
  <form class="form-horizontal" role="form">
    <fieldset>
      <legend>Payment</legend>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-holder-name">Name on Card</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="card-holder-name" id="card-holder-name" placeholder="Card Holder's Name">
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-number">Card Number</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="card-number" id="card-number" placeholder="Debit/Credit Card Number" pattern="[0-9]{13,16}" required>
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="expiry-month">Expiration Date</label>
        <div class="col-sm-9">
          <div class="row">
            <div class="col-xs-3">
            
               <input type="text" class="form-control" name="expiration" id="expirationdate" required />

            </div>
          </div>
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Card CVV</label>
        <div class="col-sm-3">
          <input type="text" class="form-control" name="cvv" id="cvv" placeholder="Security Code" pattern="[0-9]{3,4}" required>
        </div>
      </div>
      
      <br><hr>
      
      <div class="container">
        <h2>Total Price of Order - $<%= Cart.Total() %></h2>
     </div>  
      
      <hr><br>
      
      <div class="form-group">
        <div class="col-sm-offset-3 col-sm-9">
          <button type="submit" class="btn btn-success">Pay Now</button>
        </div>
      </div>
    </fieldset>
  </form>
</div>
</form>

</body>
</html>