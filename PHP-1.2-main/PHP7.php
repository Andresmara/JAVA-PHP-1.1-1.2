<!DOCTYPE html>
<html>
<head>
    <title>Ejercicio 7 de andres</title>
</head>
<body>
    <h2>Tabla de multiplicar del 1 al 10</h2>
    <table border="1" cellpadding="5">
        <?php
        for ($i = 1; $i <= 10; $i++) {
            echo "<tr>";
            for ($j = 1; $j <= 10; $j++) {
                echo "<td>" . ($i * $j) . "</td>";
            }
            echo "</tr>";
        }
        ?>
    </table>
</body>
<!--Andrés-->
</html>
