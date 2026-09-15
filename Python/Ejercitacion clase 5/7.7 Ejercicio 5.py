# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viseversa.
# Investigar las formulas

def celsius_a_fahrenheit(celsius):
    fahrenheit = celsius * 9/5 + 32
    return fahrenheit


def fahrenheit_a_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius


# Prueba de las funciones
temp_c = 25
temp_f = celsius_a_fahrenheit(temp_c)
print(f"{temp_c}°C equivalen a {temp_f}°F")

temp_f2 = 98.6
temp_c2 = fahrenheit_a_celsius(temp_f2)
print(f"{temp_f2}°F equivalen a {temp_c2}°C")