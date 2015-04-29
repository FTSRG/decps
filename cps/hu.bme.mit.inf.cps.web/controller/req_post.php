<?php

    $con = connect();
    
    $app = mysqli_real_escape_string($con, $_POST['app']);    
    $host = mysqli_real_escape_string($con, $_POST['host']);    
    $required_cpu = mysqli_real_escape_string($con, $_POST['required_cpu']);
    $required_hdd = mysqli_real_escape_string($con, $_POST['required_hdd']);
    $required_memory = mysqli_real_escape_string($con, $_POST['required_memory']);

    $query = "INSERT INTO REQUIREMENT(app, host, required_cpu, required_hdd, required_memory) VALUES('$app', '$host', '$required_cpu', '$required_hdd', '$required_memory')";
    if (!mysqli_query($con,$query)) {
      die('Error: ' . mysqli_error($con));
    }
    
    echo "<pre>Added successfully</pre>";
    include 'controller/req_get.php';

    mysqli_close($con);
    $con = null;
?>
