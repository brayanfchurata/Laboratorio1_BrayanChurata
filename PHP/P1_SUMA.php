<?php
// Solicitar dos números al usuario
echo "Ingresa el primer número: ";
$num1 = trim(fgets(STDIN));

echo "Ingresa el segundo número: ";
$num2 = trim(fgets(STDIN));

// Realizar la suma
$suma = $num1 + $num2;

// Mostrar el resultado
echo "La suma de los dos números es: " . $suma . "\n";
?>
