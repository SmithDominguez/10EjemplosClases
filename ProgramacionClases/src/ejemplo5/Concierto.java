package ejemplo5;

import java.util.List;

public class Concierto {

    private Escenario escenario;
    private List<Musico> musico;

    public Concierto(Escenario escenario) {
        this.escenario = escenario;
    }

    public Concierto(Escenario escenario, List<Musico> musico) {
        this.musico = musico;
    }
}
