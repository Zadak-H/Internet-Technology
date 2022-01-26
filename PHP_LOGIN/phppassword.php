<head><title>READING DATA FROM PASSWORD CONTROLS</title>
</head>
<body style="background:-webkit-linear-gradient(left, #3494e6, #ec6ead);" link="Black" vlink="red">
<font color="White" face="tahoma" size="4">
    <center>
    <BR>
<h1 style="color:white;text-align:center;font-size: 50px;">READING DATA FROM PASSWORD CONTROLS</h1>
<?php
IF ($_REQUEST["password1"]== "123456" and $_REQUEST["text1"]== "Rajarshi" )
{ ?>
<BR><BR>
 <h3 style="color:lightgreen;text-align:center;letter-spacing:3px;font-size: 40px;">Rajarshi, thank you for login. </h2>
PLEASE CLICK THE LINK BELOW TO FILL IN YOUR DETAILS<BR><BR><BR><BR><BR>
<a href="login.html" style="font-size: 40px;">REGISTRATION FORM</a>

 <?php
}
else {
?>
<br><br><br>
<h2 style="color:#FF4040;text-align:center;text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;letter-spacing:3px;font-size: 40px;">USER DENIED!!</h2>
Please Enter Correct Username/Password<br>
<a href="index.html"style="font-size: 40px;">RETRY</a>
<?php
}
?>
</center>
</font>
</body>
</html>