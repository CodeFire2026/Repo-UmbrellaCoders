class Producto {
    // Atributo estatico
    static contadorProductos = 0;
    // Constructor
    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }
    // getter and setter
    get idProducto() {
        return this._idProducto;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    get precio(){
        return this._precio;
    }
    set precio(precio){
        this._precio = precio;
    }
    // toString
    toString(){
        return ` ${this.idProducto} ${this.nombre} $${this.precio}`;
    }
}

class Orden {
    // Atributo estatico
    static contadorOrdenes = 0;
    // Metodo que simula la constante
    static get MAX_PRODUCTOS() {
        return 5;
    }
    // Constructor
    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }
    // Metodo agregar productos
    agregarProducto(producto){
        if (this._contadorProductosAgregados < Orden.MAX_PRODUCTOS){ // Evalua que no se haya exedido el maximo de productos
            // Agrega el producto al arreglo productos
            this._productos.push(producto)
            // El contador aumenta en 1 por cada producto agregado
            this._contadorProductosAgregados++;
        }
        else {
            console.log("Ha llegado al limite de productos.")
        }
    }
    calcularTotal(){
        let total = 0;
        this._productos.forEach(function(producto){
            total += producto.precio;
        })
        return total;
    }
    mostrarOrden(){
        let producto_orden = "";
        this._productos.forEach(function(producto){
        producto_orden += '\n    ' + producto.toString();
        })
        return `N° de orden: ${this._idOrden}
    Productos: ${producto_orden}
    Total: $${this.calcularTotal()}`;
    }
}


// VentasTest
let producto1 = new Producto("Pantalon", 62000);
let producto2 = new Producto("Campera", 43000);
let producto3 = new Producto("Zapatos", 91000);
let producto4 = new Producto("Remera", 29000)
//let producto5 = new Producto("Buzo", 33000);
//let producto6 = new Producto("Gorra", 14000);

let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
//orden1.agregarProducto(producto5);
//orden1.agregarProducto(producto6);

console.log(orden1.mostrarOrden());
