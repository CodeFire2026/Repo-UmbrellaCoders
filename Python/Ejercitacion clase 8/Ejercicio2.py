"""
Ejercicio: Definir una clase padre llamada Vehiculo y dos clases hijas llamadas Auto y Bicicleta
La clase padre debe tener los siguientes metodos y atributos:

Vehiculo (clase padre)
-atributos: (color, ruedas)
-metodos: __init__(color, ruedas), __str__()

Auto (clase hija)
-atributos: (velocidad (km/h))
-metodos: __init__(color, ruedas, velocidad), __str__()

Bicicleta (clase hija)
-atributos: (tipo(urbana/de montaña, etc)
-metodos: __init__(color, ruedas, tipo), __str__()

Crear un objeto de cada clase
"""
# Clase padre
class Vehiculo:
    # Metodo dunder init
    def __init__(self, color, ruedas):
        # Atributos
        self.color = color
        self.ruedas = ruedas

    # Metodo dunder str
    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}"

# Clase hija Auto - hereda de Vehiculo
class Auto(Vehiculo):
    # Metodo init
    def __init__(self, color, ruedas, velocidad):
        # Atributos
        super().__init__(color, ruedas)
        self.velocidad = velocidad
    # Sobreescritura metodo str
    def __str__(self):
        return f"Auto [Velocidad: {self.velocidad} km/h, {super().__str__()}]"

# Clase hija Bicicleta - hereda de Vehiculo
class Bicicleta(Vehiculo):
    # Metodo init
    def __init__(self, color, ruedas, tipo):
        # Atributos
        super().__init__(color, ruedas)
        self.tipo = tipo
    # Sobreescritura metodo str
    def __str__(self):
        return f"Bicicleta [Tipo: {self.tipo}, {super().__str__()}]"

# Creacion de Objetos para cada clase
vehiculo = Vehiculo("Amarillo", 3)
auto = Auto("Rojo", 4, 120)
bicicleta = Bicicleta("Negro", 2, "Mountain bike")

# Mostrar los datos
print(vehiculo)
print(auto)
print(bicicleta)