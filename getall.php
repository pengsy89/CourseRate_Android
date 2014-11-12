<?php
$response = array();

$conn = mysql_connect("localhost", "root", "");
$db = mysql_select_db("stevens");

$result = mysql_query("SELECT * FROM data") or die(mysql_error());

$response["data"] = array();

while ($row = mysql_fetch_array($result)) {
	$array = array();
	$array["id"] = $row["id"];
	$array["speed"] = $row["speed"];
	$array["content"] = $row["content"];
	$array["method"] = $row["method"];
	$array["evaluation"] = $row["evaluation"];
	$array["course"] = $row["course"];
	
	array_push($response["data"], $array);
}

echo json_encode($response);

mysql_close($conn);

?>