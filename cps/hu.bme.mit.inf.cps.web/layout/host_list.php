<table>
<?php

    echo "<tr><th>Name</th><th>Default CPU</th><th>Default HDD</th><th>Default Memory</th></tr>";
    
    $needToClose = false;
    if(!isset($con) || $con == null) {
        $con = connect();
        $needToClose = true;
    }
    
    $query = "SELECT * FROM host_type ORDER BY name";
    $result = mysqli_query($con, $query);

    while($row = mysqli_fetch_array($result)) {
        echo "<tr><td>" . $row['name'] . "</td><td>" . $row['default_cpu'] . "</td><td>" . $row['default_hdd'] . "</td><td>" . $row['default_memory'] . "</td></tr>";
    } 
    
    if($needToClose) {
        mysqli_close($con);
        $con = null;
    }
?>
</table>