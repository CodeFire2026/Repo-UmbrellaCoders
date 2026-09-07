# 4.4 Ejercicio 1: Matemáticas y clase math: Calcular raiz cuadrada de un numero positivo
import math # Importar clase math para usar la funcion sqrt(raiz cuadrada)
# Entrada de datos para la variable num
num = float(input("Ingrese un numero positivo: ")) # float para que el usuario pueda ingresar numeros decimales
# Ciclo para verificar si el numero es pos. o neg.
while num < 0:
    print("Error -> Ha ingresado un numero negativo")
    num = float(input("Ingrese un numero positivo: "))
# Utilizar funcion sqrt y mostrar resultado
print(f"\nLa raiz cuadrada del numero {num} es: {math.sqrt(num):.2f}")