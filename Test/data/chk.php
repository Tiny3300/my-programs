<?php
function checkNum($num){
	return ($num%2) ? TRUE:FALSE; }
$num=$_GET["n"];
if(checkNum($num)===TRUE)
	echo '����';
}else{
	echo 'ż��';
}
?>