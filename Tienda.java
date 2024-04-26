public class Tienda {
        public static void main(String[] args) {
        CarritoCompra carrito = new CarritoCompra();
        Producto leche = new Producto("Leche", 2.5, 1);
        Producto pan = new Producto("Pan", 1.0, 2);
        Producto huevos = new Producto("Huevos", 3.0, 1);
        carrito.addProducto(leche);
        carrito.addProducto(pan);
        carrito.addProducto(huevos);
        carrito.showProductos();
        carrito.clearProductos();
    }
}
