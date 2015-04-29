<table>
<?php

    echo "<tr><th>Application Name</th><th>Count</th></tr>";
    
    $needToClose = false;
    if(!isset($con) || $con == null) {
        $con = connect();
        $needToClose = true;
    }
    
    $query = "SELECT a.name AS app_name, r.count FROM request r INNER JOIN applicationtype a ON a.id = r.app ORDER BY a.name";
    $result = mysqli_query($con, $query);

    while($row = mysqli_fetch_array($result)) {
        echo "<tr><td>" . $row['app_name'] . "</td><td>" . $row['count'] . "</td></tr>";
    } 
    
    if($needToClose) {
        mysqli_close($con);
        $con = null;
    }
?>
</table>