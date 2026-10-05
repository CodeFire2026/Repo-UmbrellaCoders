class Cubo:
    """
    Ejercicio 02: crear la clase cubo, con los atributos ancho, alto y profundidad, con un metodo
    calcular_volumen que tendra la formula:
    volumen = ancho * altura * profundidad
    Los valores deben ser ingresador por el usuario
    """
    # Metodo Init Dunder
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    # Metodo para calcular el volumen del cubo
    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad

# Variables para que el usuario ingrese los valores
ancho = float(input("Ingrese el valor del ancho del cubo: "))
altura = float(input("Ingrese el valor del alto del cubo: "))
profundidad = float(input("Ingrese el valor de la profundidad del cubo: "))

# Pasamos las variables como argumentos
cubo = Cubo(ancho,altura, profundidad)

# Mostrar el resultado
print(f"\nVolumen del cubo: {cubo.calcular_volumen()}")