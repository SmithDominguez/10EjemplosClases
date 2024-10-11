package ejemplo10;

import java.util.List;

public class Avion {

    private List<Motor> motor;
    private List<Pasajero> pasajeros;

    public Avion(List<Motor> motor) {
        this.motor = motor;
    }

    public Avion(List<Motor> motor, List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
