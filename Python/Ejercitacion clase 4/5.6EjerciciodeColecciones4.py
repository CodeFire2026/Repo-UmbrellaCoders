# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 - 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de intentos.

import random

numero_secreto = random.randint(1, 100)
intentos = 0
acerto = False

while not acerto:
    intento = int(input("Ingrese un número entre 1 y 100: "))
    intentos += 1

    if intento < numero_secreto:
        print("Es mayor")
    elif intento > numero_secreto:
        print("Es menor")
    else:
        acerto = True

print("¡Acertaste! El número era", numero_secreto)
print("Número de intentos:", intentos)