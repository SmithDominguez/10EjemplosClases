package ejemplo9;

import java.util.List;

public class Empresa {

    private List<Proyecto> proyectos;
    private Consultor consultor;

    public Empresa(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public Empresa(List<Proyecto> proyectos, Consultor consultor) {
        this.consultor = consultor;
    }
}
