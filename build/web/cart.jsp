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

        <div class="container">
            <h2>Shopping Cart</h2>
            <table class="table-hover table">
                <thead><tr><th></th><th>Model Name</th><th>CPU</th><th>Memory</th><th>Hard Drive</th><th>Cost</th><th>Remove</th></tr></thead>
                            <% int i=0; for (CompBean item : Cart.getItems()) {%>
                <tr><td><img src="<%=item.getModelImage()%>" class="img-responsive" style="max-height: 10%"/></td><td><%=item.getModelName()%></td><td><%=item.getCpuDescription()%></td><td><%=item.getMemoryDescription()%></td><td><%=item.getHardDriveDescription()%></td><td>$<%=item.getTotalCost()%></td>
                    <td><form id="remove_<%=i%>" action="cart">
                            <input type="hidden" name="delete" value="<%=i%>"> <button type="submit" value="remove item" class="btn btn-danger">Remove Computer</button>
                        </form>
                    </td>
                </tr>
                <% i++; }%>
            </table>
            <table>
                <tr><td class="col-md-9"></td><td class="col-md-1 text-right"> SubTotal: </td><td class="col-md-1">$<%=Cart.subTotaltoString()%></td>
                <tr><td class="col-md-9"></td><td class="col-md-1 text-right"> Tax: </td><td class="col-md-1">$<%=Cart.salesTax()%></td>
                <tr><td class="col-md-9"></td><td class="col-md-1 text-right"> <strong>Total: </strong></td><td class="col-md-1"><strong>$<%=Cart.Total()%></strong></td>
            </table


            <br><br><br>
            <button class="btn btn-primary" type="submit">Purchase</button>


        </form>

    </div>
</div>
</div>


</body>
</html>