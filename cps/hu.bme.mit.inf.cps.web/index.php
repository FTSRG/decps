<?php
    include 'layout/header.php';
        
    if($_SERVER['REQUEST_METHOD'] === 'POST') {
        switch ($_GET["index"]) {
        case 'execute':
            include 'controller/execute_post.php';
            break;

        case 'add_app_type':
            include 'controller/app_post.php';
            break;

        case 'add_host_type':
            include 'controller/host_post.php';
            break;

        case 'add_requirement':
            include 'controller/req_post.php';
            break;
        
        case 'add_request':
            include 'controller/r_post.php';
            break;

        default:
            break;
        }
    }
    
    else if(isset($_GET["index"])) {
        switch ($_GET["index"]) {
        case 'execute':
            include 'controller/execute_get.php';
            break;

        case 'add_app_type':
            include 'controller/app_get.php';
            break;

        case 'add_host_type':
            include 'controller/host_get.php';
            break;

        case 'add_requirement':
            include 'controller/req_get.php';
            break;

        case 'add_request':
            include 'controller/r_get.php';
            break;

        default:
            break;
        }
    }
    
    include 'layout/footer.php';
    
    
    function connect() {
        $con=mysqli_connect("localhost","cps","cps","cps");
        // Check connection
        if (mysqli_connect_errno()) {
            echo "Failed to connect to MySQL: " . mysqli_connect_error();
        }
        
        return $con;
    }
    
    function connect2() {
    	$con=mysqli_connect("localhost","cps","cps");
    	// Check connection
    	if (mysqli_connect_errno()) {
    		echo "Failed to connect to MySQL: " . mysqli_connect_error();
    	}
    
    	return $con;
    }
?>
