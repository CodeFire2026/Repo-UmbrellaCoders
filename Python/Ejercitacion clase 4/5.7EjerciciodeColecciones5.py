# Ejercicio 8: Menú interactivo - Cajero automático
# Hacer un programa que simule un cajero automático con un saldo
# inicial de 1000$ y tendrá el siguiente menú de opciones:
#         1. Ingresar dinero en la cuenta
#         2. Retirar dinero de la cuenta
#         3. Mostrar dinero disponible
#         4. Salir

saldo = 1000
opcion = 0

while opcion != 4:
    print("\n1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")

    opcion = int(input("Elija una opción: "))

    if opcion == 1:
        monto = float(input("Ingrese el monto a depositar: "))
        saldo += monto
    elif opcion == 2:
        monto = float(input("Ingrese el monto a retirar: "))
        if monto > saldo:
            print("Saldo insuficiente")
        else:
            saldo -= monto
    elif opcion == 3:
        print("Saldo disponible:", saldo)
    elif opcion == 4:
        print("Gracias por usar el cajero automático")
    else:
        print("Opción inválida")
