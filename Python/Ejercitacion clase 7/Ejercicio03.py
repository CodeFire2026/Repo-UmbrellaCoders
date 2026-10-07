class Persona:
    def __init__(self, nombre, edad, dni):
        self._nombre = nombre
        self._edad = edad
        self.__dni = dni  # atributo de solo lectura (read-only)

    # --- Getter y Setter para nombre ---
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre

    # --- Getter y Setter para edad ---
    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, nueva_edad):
        if nueva_edad > 0:
            self._edad = nueva_edad
        else:
            print("La edad debe ser un valor positivo.")

    # --- Getter SIN setter (read-only) para dni ---
    @property
    def dni(self):
        return self.__dni

    # --- Método para mostrar los datos ---
    def mostrar_detalles(self):
        print(f"Nombre: {self._nombre} | Edad: {self._edad} | DNI: {self.__dni}")


# ----- Tarea: crear tres objetos más -----

persona1 = Persona("Lucía Fernández", 22, "40123456")
persona2 = Persona("Martín Gómez", 35, "30456789")
persona3 = Persona("Sofía Ramírez", 19, "45789123")

print("--- Datos originales ---")
persona1.mostrar_detalles()
persona2.mostrar_detalles()
persona3.mostrar_detalles()

# Modificar usando los setters (getter/setter)
persona1.nombre = "Lucía F. Pérez"
persona1.edad = 23

persona2.edad = 36

persona3.nombre = "Sofía R. Castro"

print("\n--- Datos después de modificar con los setters ---")
persona1.mostrar_detalles()
persona2.mostrar_detalles()
persona3.mostrar_detalles()

# Intento de modificar el atributo read-only (no tiene setter)
# persona1.dni = "99999999"  # Esto daría error: AttributeError
print(f"\nDNI de persona1 (solo lectura): {persona1.dni}")