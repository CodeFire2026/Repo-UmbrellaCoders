package caja;
public class Caja {
    // Atributos de la caja
    double alto, ancho, profundidad;
    
    // Constructor vacio
    public Caja(){}
    
    // Constructor con argumentos
    public Caja(double alto, double ancho, double profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    
    // Metodo para calcular volumen
    public double calcularVolumenCaja(){
        return alto * ancho * profundidad;
    }
}
