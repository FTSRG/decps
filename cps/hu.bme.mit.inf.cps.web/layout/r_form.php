
<?php
$needToClose = false;
if (! isset ( $con ) || $con == null) {
	$con = connect ();
	$needToClose = true;
}

$app_query = "SELECT name, id FROM applicationtype ORDER BY name";
$app_types = mysqli_query ( $con, $app_query );

?>
<div>

	<table>
		<tr>
			<td>Application Type</td>
			<td><select id="app">
                        <?php
																								while ( $row = mysqli_fetch_array ( $app_types ) ) {
																									echo "<option value='" . $row ['id'] . "'>" . $row ['name'] . "</option>";
																								}
																								?>
                    </select></td>
		</tr>
		<tr>
			<td>Count</td>
			<td><input id="count" type="text" /></td>
		</tr>
	</table>
	<input type="button" onclick="addElement()" value="Add to Request">
	<script>
			function addElement() {

				var id = guid();
				var x = document.getElementById("app").selectedIndex;
				var app = document.getElementById("app")[x].value;
				var app_name = document.getElementById("app")[x].text;
				var count = document.getElementById("count").value;

				if(count == "")
					return;
				
				document.getElementById("form").innerHTML += "<input name=\"apps[]\"  type=\"hidden\" id=\""+id+"id\" value=\""+app+"\">\n"
				document.getElementById("form").innerHTML += "<input name=\"counts[]\" type=\"hidden\" id=\""+id+"count\" value=\""+count+"\">\n"

				document.getElementById("table").innerHTML += "<tr id=\""+id+"\"><td>"+count+"</td><td>"+app_name+"</td><td><input type=\"button\" onclick=\"removeElement(\'"+id+"\')\" value=\"remove\"></td></tr>"

				document.getElementById("count").value = "";
				
				document.getElementById("create").disabled = false;
			}
			
			function guid() {
			    function _p8(s) {
			        var p = (Math.random().toString(16)+"000000000").substr(2,8);
			        return s ? "-" + p.substr(0,4) + "-" + p.substr(4,4) : p ;
			    }
			    return _p8() + _p8(true) + _p8(true) + _p8();
			}
			
			function removeElement(rowid)  
			{   
			    var row = document.getElementById(rowid);
			    var table = document.getElementById("table");
			    table.deleteRow(row.rowIndex);

			    var form = document.getElementById("form");
			    var appinput = document.getElementById(rowid+"id");
			    var countinput = document.getElementById(rowid+"count");

			    form.removeChild(appinput);
			    form.removeChild(countinput);

			    if(table.rows.length == 0) {
					document.getElementById("create").disabled = true;
				}
			}
		</script>
	<form id="form" action="index.php?index=add_request" method="post">
		<table id="table">
		</table>
		<input id="create" disabled="disabled" type="submit"
			value="Create Request">
	</form>
</div>
<?php
if ($needToClose) {
	mysqli_close ( $con );
	$con = null;
}
?>
