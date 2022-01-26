<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>File Output</title>
    <style>
        p{
            color: blue;
            text-align: center;
            justify-content: center;
        }
    </style>
</head>
<body bgcolor="white">
<p>
<?php   
$fname = $_REQUEST["name1"];
$sname = $_REQUEST["name2"];
$fs=fopen($fname, "r");
$ft=fopen($sname, "w");

if ($fs==NULL)
{
    echo "Can't Open Source File ...";
    exit(0);
}

if ($ft==NULL)
{
    echo "Can't Open Destination File ...";
    fclose ($fs);
    exit(1);
}

else
{
    while ($ch=fgets($fs))
        fputs($ft, $ch);

    fclose ($fs);
    fclose ($ft);
    echo "Copy to the Destination File ...";
}
?></p>

</body>
</html>

