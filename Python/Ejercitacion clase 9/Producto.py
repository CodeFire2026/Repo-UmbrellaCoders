class Producto:
    contador_productos = 0

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1
        self._id_producto = Producto.contador_productos
        self._nombre = nombre
        self._precio = precio

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    def __str__(self):
        return f'Id Producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self._id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)

    def calcular_total(self):
        total = 0  # Variable temporal para almacenar el total acumulado
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += str(producto) + ' | '
        return f'Orden: {self._id_orden}, Productos: {productos_str}'


if __name__ == '__main__':
    # Productos para la Orden 1 
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalón', 150.00)

    productos1 = [producto1, producto2]
    orden1 = Orden(productos1)

    print("--- ORDEN 1 ---")
    print(orden1)
    print(f"Total Orden 1: ${orden1.calcular_total():.2f}\n")

    # Tarea : Crear nuevos productos y una nueva lista para la Orden 2
    producto3 = Producto('Zapatos', 200.00)
    producto4 = Producto('Blusa', 90.00)

    productos2 = [producto3, producto4]
    orden2 = Orden(productos2)

    # Se agrega un producto adicional de manera independiente a la Orden 2
    producto5 = Producto('Cinturón', 30.00)
    orden2.agregar_producto(producto5)

    print("--- ORDEN 2 (Tarea Resuelta) ---")
    print(orden2)
    print(f"Total Orden 2: ${orden2.calcular_total():.2f}")
