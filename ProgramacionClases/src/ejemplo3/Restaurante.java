package ejemplo3;

import java.util.List;

public class Restaurante {

    private Chef chef;
    private List<Plato> platos;

    public Restaurante(Chef chef) {
        this.chef = chef;
    }

    public Restaurante(Chef chef, List<Plato> platos) {
        this.platos = platos;
    }
}
