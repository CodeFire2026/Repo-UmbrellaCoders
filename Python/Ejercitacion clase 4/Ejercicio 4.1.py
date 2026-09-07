# 4.1 Ejercicio de Colecciones 1 : Hacer un programa que contenga una lista y elimine los elementos duplicados,
# luego mostrar la lista
"""Creamos la lista"""
lista = [1, 2,"hola", 2, 3, 4, 4, 5,"hola", 1,]
"""Eliminamos los elementos repetidos convirtiendo la lista en set y tambien la volvemos a hacer lista"""
lista2 = list(set(lista))
"""Mostramos los resultados"""
print(f"Lista: {lista}")
print(f"Lista sin repetidos: {lista2}")