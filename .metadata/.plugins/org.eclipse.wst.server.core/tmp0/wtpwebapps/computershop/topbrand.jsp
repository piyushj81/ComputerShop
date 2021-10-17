<!DOCTYPE html>
<html lang="en">

<head>

  <title>BRAND</title>
  <link rel="stylesheet" href="computershop.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
    integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
    crossorigin="anonymous"></script>


</head>

<body>
  <div>
    <div class="left">
      <header class="header">
        <!---- left class for logo -->

        <a href="home.jsp">HOME</a> &nbsp;&nbsp;&nbsp;

        <a href="about.jsp">ABOUT US</a>&nbsp;&nbsp;&nbsp;

        <a href="contact.jsp">CONTACT</a>&nbsp;&nbsp;&nbsp;
        <a href="help.jsp">HELP</a>&nbsp;&nbsp;&nbsp;
    
      <a href="adminLogin.jsp" >  <button class="leftright" type="button"> Admin LOG IN</button>
    </div>
  </div>


  <!---- mid bar for navbar -->

  <div class="mid">
<img src="images/logo.jpg" alt="" height="50px" width="50px" style="float: left;">

    <ul class="navbar">
      <div class="btn-group">
        <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
          aria-expanded="false">
          PC COMPONENT
        </button>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="#">KeyBoard</a>
          <a class="dropdown-item" href="#">MOUSE</a>
          <a class="dropdown-item" href="#">MOTHERBOARD</a>

          <a class="dropdown-item" href="#">RAM</a>

          <a class="dropdown-item" href="#">HARD DISK</a>

          <a class="dropdown-item" href="#"></a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Separated link</a>
        </div>
      </div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


      <li><a href="#">GAMING ZONE</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="topbrand.jsp">TOP BRANDS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li><a href="#">OFFERS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">EXPIERIENCE ZONE</a>
      <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">BLOG</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      <div>
        <form class="form-inline my-2 my-lg-0">
          <a href="customerAdmit.jsp" class="btn btn-outline-primary my-2 my-sm-0">REGISTER</a>&nbsp;&nbsp;
          <a href= "login.jsp" class="btn btn-outline-danger my-2 my-sm-0"> Login</a>
        </form>
    </ul>
  </div>
  </div>
  <div class="peripheral">
    <center>
      <u>
        <h2>BRANDS</h2>
      </u>
    </center>
  </div>


  <br>
  <div class="right">
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
 	<li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
 	<li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
 	<li data-target="#carouselExampleIndicators" data-slide-to="5"></li>
 	
 	
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-95" src="images/s1.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-95" src="images/s2.jpg" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-95" src="images/s3.png" alt="3">
    </div>
      <div class="carousel-item">
      <img class="d-block w-95" src="images/s4.jpg" alt="4">
    </div>
    <div class="carousel-item">
      <img class="d-block w-95" src="images/s5.png" alt="5">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
  <script>
  $('.carousel').carousel({
  interval: 2000
})</script>
      </div>
    </div>
  </div>

  <br>
  <div class="footer">
    <div style="float: left; margin-left: 2px;"> <img src="images/logo.jpg" alt="" height="100px" width="100px"
        style="float: left;">

      <a href="#" "> <h3 style=" color:white;">PIYUSH COMPUTER SHOP</h3><br></a>
    </div>
    <center>
      <div style="text-align: center; float: left; " class="footerleft">
        <h3 style="color:red;">INFORMATION</h3>
        <ul>
          <li> <a href="#">Site map</a></li>
          <li> <a href="#">Bank Details</a></li>
          <li> <a href="#">Shipping & Delivery </a></li>
          <li><a href="#">Cancellation & Refund</a></li>
          <li><a href="#">Payment Method</a></li>
        </ul>
      </div>
    </center>
    <div>
      <center>
        <div class="centrediv" style="text-align: center; float: left;">
          <a href="https://www.facebook.com" class="fa fa-facebook"> </a>&nbsp;

          <a href="https://www.twitter.com" class="fa fa-twitter"></a>&nbsp;

          <a href="https://www.instagram.com" class="fa fa-instagram"> </a>&nbsp;

          <a href="https://www.linkedin.com" class="fa fa-linkedin"></a>&nbsp;

          <br> <br><br>
          <span class="fa fa-star checked"></span>
          <span class="fa fa-star checked"></span>
          <span class="fa fa-star checked"></span>
          <span class="fa fa-star"></span>
          <span class="fa fa-star"></span>
        </div>
      </center>

    </div>
    <div style="text-align: right; " class="footerright">
      <ul>
        <h3 style="color: red; ">CUSTOMER SERVICE</h3>
        <li> <a href="#">My Account</a></li>
        <li><a href="#">Order History</a></li>
        <li><a href="#">RETURNS </a></li>
        <li><a href="#">NEWS LETTER </a></li>
        <li><a href="#">GIFT CERTIFICATES </a></li>
      </ul>
    </div>
  </div>
  <script>
  function loginfirst(){
		alert("login in first");
	}
</script>
</body>

</html>