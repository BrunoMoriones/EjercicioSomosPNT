public abstract class Producto implements Comparable<Producto>{
    private String nombre;
    private int precio;

    // Constructor: asigna los valores recibidos por parámetros a los atributos de la clase
    public Producto(String nombre,int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // Post: Devuelve el nombre del producto.
    public String getNombre(){
        return nombre;
    }

    // Pre: Recibe como parámetro un String con el nuevoNombre
    // Post: Asgina el nuevoNombre al atributo nombre
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    // Post: Devuelve el precio del producto.
    public int getPrecio(){
        return precio;
    }

    // Pre: Recibe como parámetro un String con el nuevoPrecio
    // Post: Asgina el nuevoPrecio al atributo precio
    public void setPrecio(int nuevoPrecio){
        precio = nuevoPrecio;
    }

    // Post: sobrescribe el método para poder comparar los productos por el precio
    @Override
    public int compareTo(Producto otroProducto){
        return this.getPrecio() - otroProducto.getPrecio();
    }

    public abstract String toString();
}