class FiguraGeometrica:
    def __init__(self, alto, ancho):
        self.__alto = alto
        self.__ancho = ancho

    def get_alto(self):
        return self.__alto

    def set_alto(self, alto):
        self.__alto = alto

    def get_ancho(self):
        return self.__ancho

    def set_ancho(self, ancho):
        self.__ancho = ancho

    def __str__(self):
        return f"Alto: {self.__alto}, Ancho: {self.__ancho}"


class Color:
    def __init__(self, color):
        self.__color = color

    def get_color(self):
        return self.__color

    def set_color(self, color):
        self.__color = color

    def __str__(self):
        return f"Color: {self.__color}"


class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)

    def area(self):
        return self.get_alto() * self.get_ancho()

    def __str__(self):
        return (f"Cuadrado -> {FiguraGeometrica.__str__(self)}, "
                f"{Color.__str__(self)}")


class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, alto, ancho, color):
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)

    def area(self):
        return self.get_alto() * self.get_ancho()

    def __str__(self):
        return (f"Rectangulo -> {FiguraGeometrica.__str__(self)}, "
                f"{Color.__str__(self)}")


# ---------- Prueba ----------
if __name__ == "__main__":
    cuadrado1 = Cuadrado(4, "rojo")
    cuadrado2 = Cuadrado(7, "verde")
    rectangulo1 = Rectangulo(3, 5, "azul")
    rectangulo2 = Rectangulo(2, 10, "amarillo")

    figuras = [cuadrado1, cuadrado2, rectangulo1, rectangulo2]

    for figura in figuras:
        print(figura)
        print(f"Área: {figura.area()}")
        print("-" * 40)