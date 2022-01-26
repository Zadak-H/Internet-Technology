<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Details</title>
    <link rel="stylesheet" href="finalpage.css">
</head>
<body>
    <h1 style="padding:10px; margin:0 ;color:green;text-align:center;font-size: 50px;">Student's Registration Form Details</h1>
    <div class="container">
<table class="styled-table">
    <thead>
        <tr>
            <th>Clause</th>
            <th>Values</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Name</td>
            <td><?php echo $_REQUEST["firstname"];?></td>
        </tr>
        <tr class="active-row">
            <td>Guardians Name</td>
            <td><?php echo $_REQUEST["gname"];?></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><?php echo $_REQUEST["email"];?></td>
        </tr>
        <tr class="active-row">
            <td>Mobile</td>
            <td><?php echo $_REQUEST["mobile"];?></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><?php echo $_REQUEST["gender"];?></td>
        </tr>
        <tr class="active-row">
            <td>Date Of Birth</td>
            <td><?php echo $_REQUEST["dob"];?></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><?php echo $_REQUEST["address"];?></td>
        </tr>
        <tr class="active-row">
            <td>Board</td>
            <td><?php echo $_REQUEST["Board"];?></td>
        </tr>
        <tr>
            <td>Student's hobby</td>
            <td>
            <?php
                if (isset($_REQUEST["si"]))
                {
                    echo $_REQUEST["si"],"<br>";
                }
                if (isset($_REQUEST["d"]))
                {
                    echo $_REQUEST["d"],"<br>";
                }
                if (isset($_REQUEST["r"]))
                {
                    echo $_REQUEST["r"],"<br>";
                }
                if (isset($_REQUEST["sp"]))
                {
                    echo $_REQUEST["sp"],"<br>";
                }
                if (isset($_REQUEST["ph"]))
                {
                    echo $_REQUEST["ph"],"<br>";
                }
                if (isset($_REQUEST["tv"]))
                {
                    echo $_REQUEST["tv"];
                }
            ?>
            </td>
        </tr>
        <tr class="active-row">
            <td>Total Marks</td>
            <td><?php echo $_REQUEST["Total"];?></td>
        </tr>
    </tbody>
</table>
</div>
</body>
</html>