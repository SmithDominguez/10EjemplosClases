package ejemplo1;

import java.util.List;

public class Ordenador {

    private Cpu cpu;
    private List<TarjetaGrafica> tarjetaGraficas;

    public Ordenador(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ordenador(Cpu cpu, List<TarjetaGrafica> tarjetaGraficas) {
        this.tarjetaGraficas = tarjetaGraficas;
    }

}
