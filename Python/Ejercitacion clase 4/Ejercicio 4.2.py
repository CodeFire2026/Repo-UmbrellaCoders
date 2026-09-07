# 4.2 Ejercicio de Colecciones 2: Hacer un programa que tenga dos listas y crear las sgtes listas (no deben tener repeticiones):
# 1. Lista de palabras que  aparecen en las listas
# 2. Lista de palabras que aparecen en la primer lista pero no en la segunda
# 3. Lista de palabras que aparecen en la segunda lista pero no en la primera
# 4. Lista de palabras que aparecen en ambas listas
"""Creacion de las listas"""
lista_1 = ["Juan", "Ariel", "Natalia", "Jose"]
lista_2 = ["Jose", "Carlos", "Juan", "Marcos"]
print(f"Lista 1: {lista_1}")
print(f"Lista 2: {lista_2}")
# 1.
lista1 = list(set(lista_1) | set(lista_2))
print(f"Lista de palabras que aparecen en las listas sin repetir: {lista1}")
# 2.
lista2 = list(set(lista_1) - set(lista_2))
print(f"Lista de palabras que aparecen en la primer lista pero no en la segunda: {lista2}")
# 3.
lista3 = list(set(lista_2) - set(lista_1))
print(f"Lista de palabras que aparecen en la segunda lista pero no en la primera: {lista3}")
# 4.
lista4 = list(set(lista_1) & set(lista_2))
print(f"Lista de palabras que aparecen en ambas listas: {lista4}")