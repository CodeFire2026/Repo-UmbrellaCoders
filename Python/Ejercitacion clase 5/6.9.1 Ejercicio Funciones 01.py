# Ejercicio 3: Crear una funcion para sumar los valor recibidos de tipo num,
# utilizando argumentos variables *args como parametro de la funcion y agregar
# como resultao la suma de todos los valores pasados como argumentos
# Funcion
def sumarNumeros(*args):
    suma = 0
    for i in args:
        suma += i
    return suma
# Llamar la funcion y pasar argumentos, mostrar resultado
print(f"\nEl resultado de la suma es: {sumarNumeros(10, 15, 17, 5, 33, 5, 15)}")