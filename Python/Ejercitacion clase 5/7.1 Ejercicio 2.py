# Ejercicio 2: Función con *args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumento

def multiplicar(*args):
    resultado = 1
    for valor in args:
        resultado *= valor
    return resultado


# Prueba de la función
print(multiplicar(2, 3, 4))       # 24
print(multiplicar(5, 5))          # 25
print(multiplicar(1, 2, 3, 4, 5)) # 120