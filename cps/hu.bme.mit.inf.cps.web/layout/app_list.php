<table>
<?php

    echo "<tr><th>Name</th><th>EXE File URL</th><th>EXE File Type</th><th>ZIP File Url</th></tr>";
    
    $needToClose = false;
    if(!isset($con) || $con == null) {
        $con = connect();
        $needToClose = true;
    }
    
    $query = "SELECT * FROM applicationtype ORDER BY name";
    $result = mysqli_query($con, $query);

    if($result != false)
	    while($row = mysqli_fetch_array($result)) {
	        echo "<tr><td>" . $row['name'] . "</td><td>" . $row['exeFileUrl'] . "</td><td>" . $row['exeFileType'] . "</td><td>" . $row['zipFileUrl'] . "</td></tr>";
	    } 
    
    if($needToClose) {
        mysqli_close($con);
        $con = null;
    }
?>
</table>