public class ProductoPorUnidad extends Producto{
    private String unidad;
    
    //Constructor: Se le asignan los valores recibidos por parámetro a los atributos nombre y precio heredados de la clase Producto, y al 
    //             atributo unidad agregado en esta clase
    public ProductoPorUnidad(String nombre, int precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    // Post: Devuelve la unidad del producto.
    public String getUnidad(){
        return unidad;
    }

    // Pre: Recibe como parámetro un String con la nuevaUnidad
    // Post: Asgina la nuevaUnidad al atributo unidad
    public void setUnidad(String nuevaUnidad){
        this.unidad = nuevaUnidad;
    }

    // Post: sobrescribe el método para dar la información sobre el producto según se pide
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// " + this.getUnidad();
    }
    
}
