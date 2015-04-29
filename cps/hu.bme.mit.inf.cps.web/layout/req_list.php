<table>
<?php

    echo "<tr><th>Application Name</th><th>Host Name</th><th>Required CPU</th><th>Required HDD</th><th>Required Memory</th></tr>";
    
    $needToClose = false;
    if(!isset($con) || $con == null) {
        $con = connect();
        $needToClose = true;
    }
    
    $query = "SELECT a.name AS app_name, r.host AS host_name, r.required_cpu, r.required_hdd, r.required_memory FROM requirement r INNER JOIN applicationtype a ON a.id = r.app ORDER BY a.name";
    $result = mysqli_query($con, $query);

    while($row = mysqli_fetch_array($result)) {
        echo "<tr><td>" . $row['app_name'] . "</td><td>" . $row['host_name'] . "</td><td>" . $row['required_cpu'] . "</td><td>" . $row['required_hdd'] . "</td><td>" . $row['required_memory'] . "</td></tr>";
    } 
    
    if($needToClose) {
        mysqli_close($con);
        $con = null;
    }
?>
</table>