package ejemplo6;

import java.util.List;

public class Edificio {

    private Piso piso;
    private List<Propietario> propietarios;

    public Edificio(Piso piso) {
        this.piso = piso;
    }

    public Edificio(Piso piso, List<Propietario> propietarios) {
        this.piso = piso;
        this.propietarios = propietarios;
    }
}
