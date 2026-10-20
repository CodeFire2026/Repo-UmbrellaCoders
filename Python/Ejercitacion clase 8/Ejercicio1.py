"""
Tarea: - Encapsular los atributos y agregar los metodos getter and setter
       - Crear otro objetos y pasar sus respectivos datos
       - Mostrar los datos, luego hacer una modificacion y volver a mostrar
"""
class Persona:
    def __init__(self, nombre, edad):
        self._nombre = nombre # Ahora estan encapsulados
        self._edad = edad

    # Metodos getter and setter
    @property
    def nombre(self):
        return self._nombre
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self, edad):
        self._edad = edad

    # Metodo dunder str
    def __str__(self):
        return f"Persona [ Nombre: {self._nombre}, Edad: {self._edad}]"

class Empleado(Persona):
    def __init__(self,nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo
    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    # Sobreescritura del metodo para mostrar los datos
    def __str__(self):
        return f"Empleado: [ Sueldo: {self._sueldo}; {super().__str__()}]"


empleado1 = Empleado("Juan", 28, 56000)
print(empleado1)
empleado2 = Empleado("Jose", 23, 71000)
print(empleado2)
empleado1.sueldo = 85000
empleado1.edad = 25
empleado2.nombre = "Martin"
print(empleado1)
print(empleado2)