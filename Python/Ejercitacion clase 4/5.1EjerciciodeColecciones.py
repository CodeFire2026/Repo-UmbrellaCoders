# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# de un rango, por ejemplo:
#                     suma de números pares del 2 al 30
#                     suma = 240

inicio = int(input("Ingrese el número inicial del rango: "))
fin = int(input("Ingrese el número final del rango: "))

suma = 0

for numero in range(inicio, fin + 1):
    if numero % 2 == 0:
        suma += numero

print("suma =", suma)