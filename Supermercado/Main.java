import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List <Producto> productos = cargarProductos();

        for (Producto unProducto : productos){
            System.out.println(unProducto.toString());
        }

        System.out.println("=============================");
        System.out.println("Producto más caro: " + Collections.max(productos).getNombre());
        System.out.println("Producto más barato: " + Collections.min(productos).getNombre());
    }

    // Post: Retorna la lista con los productos ya agregados
    private static List<Producto> cargarProductos(){
        List<Producto> productos = new ArrayList<>();
        
        ProductoPorEnvase cocaColaZero = new ProductoPorEnvase("Coca-Cola Zero", 20, "Litros: 1.5");
        ProductoPorEnvase cocaCola = new ProductoPorEnvase("Coca-Cola", 18, "Litros: 1.5");
        ProductoPorEnvase shampooSedal = new ProductoPorEnvase("Shampoo Sedal", 19, "Contenido: 500ml");
        ProductoPorUnidad frutillas = new ProductoPorUnidad("Frutillas", 64, "Unidad de venta: kilo");

        productos.add(cocaColaZero);
        productos.add(cocaCola);
        productos.add(shampooSedal);
        productos.add(frutillas);

        return productos;
    }
}
