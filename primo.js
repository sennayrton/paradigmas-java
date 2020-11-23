<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
 
	<script>
    function esPrimo(num) {
        if (num<=1 || num%1) {
            return false;
        }
        let m=Math.sqrt(num);
        for (let i=2; i<=m; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
 
	function primo()
	{
		let valor=parseInt(document.getElementById("valor").value);
		if (esPrimo(valor)) {
			document.getElementById("resultado").innerHTML="El numero "+valor+" SI es Primo";
		} else {
			document.getElementById("resultado").innerHTML="El numero "+valor+" NO es Primo";
        }
	}
	</script>
</head>
<body>
 
<h4>Determinar si un valor es primo</h4>
 
<input type="text" id="valor" value="" placeholder="introduce un valor numérico">
<input type="button" onclick="primo()" value="Primo">
 
<div id="resultado"></div>
 
</body>
</html>