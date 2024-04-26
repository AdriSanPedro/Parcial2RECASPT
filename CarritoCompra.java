import java.util.ArrayList;

public class CarritoCompra {
    private static ArrayList<Producto> productos;
    private static double total;

    public CarritoCompra() {
        productos = new ArrayList<>();
        total = 0.0;
    }

    // Este metodo sirve para agregar productos
    public void addProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio() * producto.getCantidad();
        System.out.println(producto.getNombre() + Mensajes.PRODUCTO_ANADIDO + " Cantidad: " + producto.getCantidad()
                + ". Precio total: $" + producto.getPrecio() * producto.getCantidad());
    }

    // Este metodo sirve para mostrar todos los productos existentes en el array de productos
    public void showProductos() {
        if (productos.isEmpty()) {
            System.out.println(Mensajes.CARRITO_VACIO);
        } else {
            System.out.println(Mensajes.PRODUCTOS_EN_CARRITO);
            for (Producto producto : productos) {
                System.out.println("- " + producto.getNombre() + " (Cantidad: " + producto.getCantidad() + ")");
            }
            System.out.println("Total: $" + total);
        }
    }
    // Este metodo sirve para eliminar todos los productos del array de productos
    public void clearProductos() {
        productos.clear();
        total = 0.0;
        System.out.println(Mensajes.CARRITO_VACIADO);
        showProductos();
    }
    // Este metodo sirve para sustituir los textos fijos en constantes para poder utilizarlas y asi no repetir codigo si en algun momento se necesita el mismo sysout
    static class Mensajes {
        static final String PRODUCTO_ANADIDO = " añadido al carrito.";
        static final String CARRITO_VACIO = "El carrito está vacío.";
        static final String PRODUCTOS_EN_CARRITO = "Productos en el carrito:";
        static final String CARRITO_VACIADO = "Carrito vaciado.";
    }

}