<?php

    $con = connect();
    
    $name = mysqli_real_escape_string($con, $_POST['name']);    
    $default_cpu = mysqli_real_escape_string($con, $_POST['default_cpu']);
    $default_hdd = mysqli_real_escape_string($con, $_POST['default_hdd']);
    $default_memory = mysqli_real_escape_string($con, $_POST['default_memory']);

    $query = "INSERT INTO HOST_TYPE(name, default_cpu, default_hdd, default_memory) VALUES('$name', '$default_cpu', '$default_hdd', '$default_memory')";
    if (!mysqli_query($con,$query)) {
      die('Error: ' . mysqli_error($con));
    }
    
    echo "<pre>Added successfully</pre>";
    include 'controller/host_get.php';

    mysqli_close($con);
    $con = null;
?>
