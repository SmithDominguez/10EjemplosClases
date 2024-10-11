package ejemplo7;

import java.util.List;

public class Vehiculo {

    private Motor motor;
    private Radio radio;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    public Vehiculo(Motor motor, Radio radio) {
        this.motor = motor;
        this.radio = radio;
    }
}
