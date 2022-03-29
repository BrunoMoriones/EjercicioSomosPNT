public class ProductoPorEnvase extends Producto{
    private String cantidad;

    //Constructor: Se le asignan los valores recibidos por parámetro a los atributos nombre y precio heredados de la clase Producto, y al 
    //             atributo cantidad agregado en esta clase
    public ProductoPorEnvase(String nombre, int precio, String cantidad) {
        super(nombre, precio);
        this.cantidad = cantidad;
    }

    // Post: Devuelve la cantidad del producto.
    public String getCantidad(){
        return cantidad;
    }

    // Pre: Recibe como parámetro un String con la nuevaCantidad
    // Post: Asgina la nuevaCantidad al atributo cantidad
    public void setCantidad(String nuevaCantidad){
        this.cantidad = nuevaCantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// " + this.getCantidad() + " /// Precio: $" + this.getPrecio();
    }
}