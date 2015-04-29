<?php
$con = connect ();

$name = mysqli_real_escape_string ( $con, $_POST ['name'] );
$exeFileUrl = mysqli_real_escape_string ( $con, $_POST ['exeFileUrl'] );
$exeFileType = mysqli_real_escape_string ( $con, $_POST ['exeFileType'] );

/*
$canInsert = true;
try {
	include 'upload.php';
} catch ( Exception $e ) {
	echo $e->getMessage ();
	$canInsert = false;
}
$zipFileUrl = "localhost/cps/uploads" . $id;
*/

$zipFileUrl = mysqli_real_escape_string($con, $_POST['zipFileUrl']);


if ($canInsert) {
	$query = "INSERT INTO APPLICATIONTYPE(name, exeFileUrl, exeFileType, zipFileUrl) VALUES('$name', '$exeFileUrl', '$exeFileType', '$zipFileUrl')";
	if (! mysqli_query ( $con, $query )) {
		die ( 'Error: ' . mysqli_error ( $con ) );
	}
	
	echo "<pre>Added successfully</pre>";
}
include 'controller/app_get.php';

mysqli_close ( $con );
$con = null;
?>
