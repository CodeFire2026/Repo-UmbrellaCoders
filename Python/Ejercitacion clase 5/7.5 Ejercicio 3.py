# Ejercicio 3: Función Recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada

def contar_descendente(numero):
    if numero <= 0:
        return
    print(numero)
    contar_descendente(numero - 1)


# Prueba de la función
contar_descendente(5)
print("---")
contar_descendente(3)
print("---")
contar_descendente(-2)  # No imprime nada