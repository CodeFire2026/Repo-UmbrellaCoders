# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input("Ingrese un número positivo: "))

while numero < 0:
    numero = int(input("Ese número es negativo. Ingrese un número positivo: "))

factorial = 1

for i in range(1, numero + 1):
    factorial *= i

print("El factorial de", numero, "es", factorial)