package ejemplo8;

import java.util.List;

public class Tienda {

    private List<Producto> productos;
    private Limpiador limpiador;

    public Tienda(List<Producto> productos) {
        this.productos = productos;
    }

    public Tienda(List<Producto> producto, Limpiador limpiador) {
        this.limpiador = limpiador;
    }
}
