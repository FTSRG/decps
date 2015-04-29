
<?php
    $needToClose = false;
    if (!isset($con) || $con == null) {
        $con = connect();
        $needToClose = true;
    }

    $app_query = "SELECT name, id FROM applicationtype ORDER BY name";
    $app_types = mysqli_query($con, $app_query);

    $service_url = "localhost:8070/cps/hosts";    
    $curl = curl_init($service_url);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    $curl_response = curl_exec($curl);
    if ($curl_response === false) {
    	$info = curl_getinfo($curl);
    	curl_close($curl);
    	die('error occured during curl exec. Additioanl info: ' . var_export($info));
    }
    curl_close($curl);
    
?>
<div>
    <form action="index.php?index=add_requirement" method="post">

        <table>
            <tr>
                <td>Application Type</td>
                <td><select name="app">
                        <?php 
                            while ($row = mysqli_fetch_array($app_types)) {
                                echo "<option value='" . $row['id'] . "'>" . $row['name'] . "</option>";
                            }
                        ?>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Host Type</td>
                <td><select name="host">
                        <?php 
                        	foreach (explode(";", $curl_response) as $value) {
								echo "<option value='" . $value . "'>" . $value . "</option>";
							}
                        ?>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Required CPU</td>
                <td><input name="required_cpu" type="text" /></td>
            </tr>
            <tr>
                <td>Required HDD</td>
                <td><input name="required_hdd" type="text" /></td>
            </tr>
            <tr>
                <td>Required Memory</td>
                <td><input name="required_memory" type="text" /></td>
            </tr>
        </table>

        <input type="submit" value="Create Requirement Type">
    </form> 
</div>
<?php
    if($needToClose) {
        mysqli_close($con);
        $con = null;
    }
?>
