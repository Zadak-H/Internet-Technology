<?php
$flag = false;
$server = "localhost";
$username = "root";
$password = "";

$con = mysqli_connect($server,$username,$password);

if(!$con)
{
    echo "Conntection failed ". "$con->error";
}

$name = $_REQUEST['name'];
$roll = $_REQUEST['roll'];
$marks = $_REQUEST['marks'];
$dept = $_REQUEST['dept'];
$sql = "INSERT INTO `student`.`stu` ( `name`, `roll`, `marks`, `dept`, `dt`) VALUES ( '$name', '$roll', '$marks', '$dept', current_timestamp());";

$result=mysqli_query($con,$sql);

if($result==true)
{
    $flag=true;
}
else{
    echo "can not Insert data to database." . "$con->error";
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form Details</title>
    <link rel="stylesheet" href="stu_style.css">
</head>
<body>
    <div class="container">
        <div class="head_box">
            <h1>Student Form Details</h1>
        </div>
        <div class="table_box">
        <?php
                if($flag==true)
                {
                    $sql2="SELECT * from `student`.`stu`";
                    $result1=mysqli_query($con,$sql2);
                    // echo "<br><center><table>";
                    // echo "<tr><th>ROLL NO.</th><th>NAME</th><th>MARKS</th></tr>";
                    // while($row=mysqli_fetch_assoc($result1))
                    // {
                    //     echo "<tr><td style='padding:0 15px 0 15px;'>" . $row['roll'] . "</td>";
                    //     echo "<td style='padding:0 15px 0 15px;'>" . $row['name'] . "</td>";
                    //     echo "<td style='padding:0 15px 0 15px;'>" . $row['marks'] . "</td></tr>";
                    // }
                    // echo "</table></center>";

                    echo "<br><center><table cellspacing='0' cellpadding='0' border='0' width='555'>
                    <tr>
                      <td>
                         <table cellspacing='0' cellpadding='20' border='5' width='550' >
                           <tr style='color:white;background-color:grey'>
                              <th>Sno</th>
                              <th>Roll</th>
                              <th>Name of Student</th>
                              <th>Marks</th>
                              <th>Department</th>
                           </tr>
                         </table>
                      </td>
                    </tr>
                    <tr>
                      <td>
                         <div style='width:600px; height:400px; overflow-y:auto; overflow-x:hidden;'>
                           <table cellspacing='10' cellpadding='0' border='1' width='650' >
                             ";
                             $i=1;
                             while($row=mysqli_fetch_assoc($result1))
                            {
                                echo "<tr><td>" . $i . "</td>";
                                echo "<td>" . $row['roll'] . "</td>";
                                echo "<td>" . $row['name'] . "</td>";
                                echo "<td>" . $row['marks'] . "</td>";
                                echo "<td>" . $row['dept'] . "</td>";
                                $i++;
                            }
                            echo "
                             
                           </table>  
                         </div>
                      </td>
                    </tr>
                  </table></center>";
                }
            ?>
        </div>
        <div class="buttonclass">
                <button id="re-enter" onclick="location.href = 'index.html';">Re-Enter</button>
        </div>
    </div>
</body>
</html>
<!-- INSERT INTO `stu` (`sno`, `name`, `roll`, `marks`, `dept`, `dt`) VALUES ('1', 'Raj', '501', '595', 'Computer Science', current_timestamp());  -->