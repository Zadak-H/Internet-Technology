<html>
<head><title>To sort data using Bubble Sort Method</title></head>
<body bgcolor="black">
<font face="impact" size="6" color="orange">
<h1 style="background-color:red;color:white";>To sort data using Bubble Sort method</h1>
<?php
$a[1]=$_POST['n1'];
$a[2]=$_POST['n2'];
$a[3]=$_POST['n3'];
$a[4]=$_POST['n4'];
$a[5]=$_POST['n5'];

 // To display original list
echo " Orginal List"."<br/>";
$n=5;
display($a,$n);
echo "<br/>";
bubble($a,$n); // To sort data in ascending order
echo "<br/>";
echo "Sorted List"."<br/>";
display($a,$n);
function display($x,$m)
{
echo "Number "."<br/>";
for($i=1;$i<=$m;$i++)
echo $x[$i]."<br/>";
}
function bubble(&$x,&$m)
{
$n1=$m;
$flag=0;
$pass=0;
while($flag==0)
{
$flag=1;
$pass=$pass+1;
$n1=$n1-1;
for($i=1;$i<=$n1;$i++)
{
if($x[$i]>$x[$i+1])
{
swap($x[$i],$x[$i+1]);
$flag=0;
}
echo "Pass=$pass Step=$i"."<br/>";
display($x,$m);
}
}
}

 //swap() function
function swap(&$x,&$y)
{
$t=$x;
$x=$y;
$y=$t;
}
?>
<pre> <a href="bubble_sort.html">BACK TO HTML FORM</a>
</body>
</html>