# 4.3 Ejercicio de Colecciones 3: Agregar personajes a una lista:
# Hacer un programa y crear una lista con los siguientes personajes del señor de los anillos
"""
Nombre: Aragon              Nombre: Gandalf     Nombre: Legolas
Clase: Guerrero             Clase: Mago         Clase: Arquero
Raza: Dunadan del norte     Raza: Istar         Raza: Elfo Sindar
"""
# Crear la lista
personajes = []
# Crear los diccionarios para cada personaje
# Primer personaje
personaje1 = {
    "Nombre": "Aragon",
    "Clase": "Guerrero",
    "Raza": "Dunadan del norte"
}
# Segundo personaje
personaje2 = {
    "Nombre": "Gandalf",
    "Clase": "Mago",
    "Raza": "Istar"
}
# Tercer personaje
personaje3 = {
    "Nombre": "Legolas",
    "Clase": "Arquero",
    "Raza": "Elfo Sindar"
}
personajes.append(personaje1)
personajes.append(personaje2)
personajes.append(personaje3)
print("Lista de personajes:")
j = 0
for i in personajes:
    j += 1
    print(f"Personaje {j}: {i}")