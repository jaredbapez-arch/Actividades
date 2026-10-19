package escuela;

public class Alumno extends Persona {

    public Alumno() {
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + nombre;
    }
}