seleccionArgentina = {
    1: {'Nombre': 'Emiliano Martínez', 'Edad': 34, 'Altura': 1.95, 'Precio': '25 Millones', 'Posicion': 'Portero'},
    4: {'Nombre': 'Nahuel Molina', 'Edad': 28, 'Altura': 1.75, 'Precio': '22 Millones', 'Posicion': 'Lateral Derecho'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 28, 'Altura': 1.86, 'Precio': '45 Millones', 'Posicion': 'Defensa Central'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 38, 'Altura': 1.83, 'Precio': '3 Millones', 'Posicion': 'Defensa Central'},
    3: {'Nombre': 'Nicolás Tagliafico', 'Edad': 34, 'Altura': 1.69, 'Precio': '4 Millones', 'Posicion': 'Lateral Izquierdo'},
    7: {'Nombre': 'Rodrigo De Paul', 'Edad': 32, 'Altura': 1.80, 'Precio': '18 Millones', 'Posicion': 'Mediocampo Central'},
    24: {'Nombre': 'Enzo Fernández', 'Edad': 25, 'Altura': 1.78, 'Precio': '80 Millones', 'Posicion': 'Mediocampo Central'},
    20: {'Nombre': 'Alexis Mac Allister', 'Edad': 27, 'Altura': 1.74, 'Precio': '65 Millones', 'Posicion': 'Mediocampo Central'},
    10: {'Nombre': 'Lionel Messi', 'Edad': 39, 'Altura': 1.70, 'Precio': '15 Millones', 'Posicion': 'Extremo Derecho'},
    9: {'Nombre': 'Julián Álvarez', 'Edad': 26, 'Altura': 1.70, 'Precio': '90 Millones', 'Posicion': 'Delantero Centro'},
    22: {'Nombre': 'Lautaro Martínez', 'Edad': 29, 'Altura': 1.74, 'Precio': '110 Millones', 'Posicion': 'Delantero Centro'}
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Como tarea agregar por lo menos 4 Jugadores mas al diccionario: seleccionArgentina
print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))