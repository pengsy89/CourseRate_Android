<?php
$response = array();

if (isset($_POST['speed']) && isset($_POST['content']) && isset($_POST['method']) && isset($_POST['evaluation'])) {
	$speed = $_POST['speed'];
	$content = $_POST['content'];
	$method = $_POST['method'];
	$evaluation = $_POST['evaluation'];
	$course = $_POST['course'];
	
	$conn = mysql_connect("localhost", "root", "");
	$db = mysql_select_db("stevens");
	
	$result = mysql_query("INSERT INTO data VALUES('', '$speed', '$content', '$method', '$evaluation', '$course')");
	
	mysql_close($conn);
}
?>