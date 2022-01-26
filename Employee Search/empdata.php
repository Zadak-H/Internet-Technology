<?php
    $flag=0;
    $server = "localhost";
    $username = "root";
    $password = "";

    $con = mysqli_connect($server, $username,$password);
    if(!$con)
        die ('Cannot use MySQL : ' . mysql_error());

    $database = $_REQUEST['dbname'];
    $table = $_REQUEST['tname'];
    $eid = $_REQUEST['eid'];
    $sql = "select * from `$database`.`$table` WHERE eid = '$eid'";
    $result = mysqli_query($con,$sql);
    if($result)
        $flag = 1;
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <link rel="stylesheet" href="./css/emp_style.css">
</head>
<body>
    <div class="lefthalf"></div>
    <div class="righthalf">
        <div class="container">
            <?php
                if($flag==1)
                {
                    $row=mysqli_fetch_assoc($result);
                    $name = $row['ename'];
                    $id = $row['eid'];
                    $dept = $row['edept'];
                    $sal = $row['esal'];
                    $email = $row['email'];
                    $phno = $row['phno'];
                    $add = $row['eadd'];
                    $doj = $row['doj'];
                }
            ?>
            <h1>Employee's Details</h1>
            <label>Name:<p><?php echo $name?></p></label>
            <label>ID:<p><?php echo $id?></p></label>
            <label>Department:<p><?php echo $dept?></p></label>
            <label>Salary:<p><?php echo $sal?></p></label>
            <label>Email:<p><?php echo $email?></p></label>
            <label>Mobile:<p><?php echo $phno?></p></label>
            <label>Address:<p><?php echo $add?></p></label>
            <label>Date Of Joining:<p><?php echo $doj?></p></label>
            <div class="buttonclass">
                <button id="re-enter" onclick="location.href = 'index.html';">Home</button>
            </div>
        </div>
    </div>
</body>
</html>