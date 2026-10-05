class Rectangulo:
    """
    Ejercicio 01: crear una clase llamada rectangulo, con dos atributos (base, altura), el nombre del metodo sera
    calcular_area utilizando la formula:
    area = base * altura. La base y la altura deben ser ingresados por el usuario y los objetos deben ser tres.
    """
    # Metodo inicializador
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    # Metodo para calcular el area
    def calcular_area(self):
        return self.base * self.altura

# Funcion para ingresar los datos y no repetir codigo
def ingresar_valores(i):
    print(f"\nRectangulo {i}")
    base = float(input("Digite el valor de la base: "))
    altura = float(input("Digite el valor de la altura: "))
    print("Datos cargados.")
    return Rectangulo(base, altura)


# Crear los tres objetos
rectangulo1 = ingresar_valores(1)
rectangulo2 = ingresar_valores(2)
rectangulo3 = ingresar_valores(3)

# Mostrar resultados
print("\nResultados:")
print(f"Area del rectangulo 1: {rectangulo1.calcular_area()}")
print(f"Area del rectangulo 2: {rectangulo2.calcular_area()}")
print(f"Area del rectangulo 3: {rectangulo3.calcular_area()}")