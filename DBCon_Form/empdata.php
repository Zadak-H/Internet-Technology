<html>
<head><title>To insert data in MYSQL Database</title></head>
<body bgcolor="coral">
<font face="impact" color="#000000" size="6">
<center><u>To submit data in MYSQL Database</u></center>
<?php
//To connect database : employee
$servername="localhost";
$username="root";
$password="";
$dbname="employee";
$connect=mysqli_connect($servername,$username,$password,$dbname);
if($connect)
{
echo "Database connected successfully"."<br/>";
}
else
{
die("***Database not connected***");
}
?>
<?php
//To add data to table
$eid=$_REQUEST['eid'];
$ename=$_REQUEST['ename'];
$esal=$_REQUEST['esal'];
$edept=$_REQUEST['edept'];

$sql1="INSERT INTO emp Values('$eid','$ename','$esal','$edept')";
$result=mysqli_query($connect,$sql1);
if($result)
{
echo " Data added to EMP table"."<br/>";
}
else
{
die("***Data not added to EMP***");
}
//To retrieve data from EMP
$sql2="SELECT * from emp";
$result1=mysqli_query($connect,$sql2);
$nrec=0; //$nrec=number of records
while($row=mysqli_fetch_assoc($result1))
{
$data=$row['eid']." : ".$row['ename']." : ".$row['esal']." : ".$row['edept']."<br/>";
echo $data;
$nrec++;
}
echo "Number of records added=$nrec"."<br/>";

?>
<pre> <a href="index.html">Click to add more data</a>
</body>
</html>