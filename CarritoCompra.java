import java.util.ArrayList;

public class CarritoCompra {
    private static ArrayList<Producto> productos;
    private static double total;

    public CarritoCompra() {
        productos = new ArrayList<>();
        total = 0.0;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio() * producto.getCantidad();
        System.out.println(producto.getNombre() + " añadido al carrito. Cantidad: " + producto.getCantidad() + ". Precio total: $" + producto.getPrecio() * producto.getCantidad());
    }

    public void showProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto producto : productos) {
                System.out.println("- " + producto.getNombre() + " (Cantidad: " + producto.getCantidad() + ")");
            }
            System.out.println("Total: $" + total);
        }
    }
    public void clearProductos(){
    productos.clear();
    total = 0.0;
    System.out.println("Carrito vaciado.");
    showProductos();
    }


}