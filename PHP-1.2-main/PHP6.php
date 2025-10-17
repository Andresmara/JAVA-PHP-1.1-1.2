<!DOCTYPE html>
<html>
<head>
    <title>Ejercicio 6 de andres</title>
</head>
<body>
    <form>
        <label for="numero">Elige un número del 1 al 10:</label>
        <select name="numero" id="numero">
            <?php
            for ($i = 1; $i <= 10; $i++) {
                echo "<option value='$i'>$i</option>";
            }
            ?>
        </select>
    </form>
</body>
<!--Andrés-->
</html>
