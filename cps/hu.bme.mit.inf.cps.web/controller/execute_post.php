<?php
    $service_url = "localhost:8070/cps/next";
    
    $curl = curl_init($service_url);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    $curl_response = curl_exec($curl);
    if ($curl_response === false) {
        $info = curl_getinfo($curl);
        curl_close($curl);
        die('error occured during curl exec. Additioanl info: ' . var_export($info));
    }
    curl_close($curl);
    include 'layout/execute_button.php';
?>

<pre><?php echo htmlspecialchars($curl_response); ?></pre>
