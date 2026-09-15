# 6.2 Ejercicio 11: Agenda telefonica
# Hacer un programa que simule una agenda de contactos. Crear un diccionario
# donde la clave sea el nombre del usuario y el valor su numero de telefono
# el programa debe tener las sgtes opciones
#           1. Nuevo contacto
#           2. Borrar contacto
#           3. Ver contacos existentes
#           4. Salir
print("--- Agenda telefonica ---")
# Diccionario para la agenda
agenda = {}
# Ciclo para el menu
while True:
    # Menu:
    print("\n1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    opcion = input("Seleccione una opcion una opcion: ")

    # 1. Nuevo contacto
    if opcion == "1":
        #Pedir al usuario que ingrese el nombre y numero de la persona que desea agregar
        nombre = input("Ingrese el nombre del contaco que desea agregar: ")
        numero = input("Ingrese el numero de telefono: ")
        # Agregamos el elemento al diccionario
        agenda[nombre] = numero
        print(f"Se agrego a {nombre} a sus contacos")
    # 2. Borrar contacto
    elif opcion == "2":
        # Pedir al suario que ingrese el nombre de quien desea borrar de la agenda
        borrar = input("Ingrese el nombre del contacto que desea borrar: ")
        # Condicional para verificar que el elemento exista y borrarlo
        if borrar in agenda:
            agenda.pop(borrar)
            print(f"Se elimino a {borrar} de tus contacos")
        else:
            print("Contacto no encontrado")
    # 3. Ver contactos existentes
    elif opcion == "3":
        # El condicional evalua si el diccionario esta vacio o contiene al menos un elemento y muestra el mensaje correspondiente
        if len(agenda) >= 1:
            for nombre, telefono in agenda.items():
                print(f"{nombre} : {telefono}")
        else:
            print("Sin contactos registrados")
    # 4. Salir
    elif opcion == "4":
        print("Programa finalizado")
        break
    else:
        print("Opcion no valida")