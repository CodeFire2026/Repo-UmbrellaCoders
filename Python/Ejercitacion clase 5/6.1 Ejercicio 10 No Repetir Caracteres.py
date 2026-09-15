# 6.1 Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado
# luego pasar los caracter a una lista sin que se repitan.
cadena = input("Ingrese una cadena: ")
cadena2 = []
for caracter in cadena:
    if caracter not in cadena2:
        cadena2.append(caracter)
print("Lista de caracteres sin rpetidos: ", cadena2)