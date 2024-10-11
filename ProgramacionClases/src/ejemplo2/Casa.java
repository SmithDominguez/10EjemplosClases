package ejemplo2;

import java.util.List;

public class Casa {

    private Habitacion habitacion;
    private List<Mueble> muebles;

    public Casa(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Casa(Habitacion habitacion, List<Mueble> muebles) {
        this.muebles = muebles;
    }
}
