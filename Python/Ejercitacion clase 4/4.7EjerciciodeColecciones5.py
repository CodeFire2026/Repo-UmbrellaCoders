# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los número del 1 al 10, luego modificar los
# elementos de la lista multiplicandolos por un valor ingresado por el usuario

lista = []

for numero in range(1, 11):
    lista.append(numero)

valor = int(input("Ingrese un valor para multiplicar los elementos de la lista: "))

for i in range(len(lista)):
    lista[i] = lista[i] * valor

for numero in lista:
    print(numero, end='-')