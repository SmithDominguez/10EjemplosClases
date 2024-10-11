package ejemplo4;

import java.util.List;

public class Universidad {

    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Universidad(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Universidad(List<Estudiante> estudiantes, Profesor profesor) {
        this.profesor = profesor;
    }

}
