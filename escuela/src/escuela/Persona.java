package escuela;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}