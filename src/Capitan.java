public class Capitan {
    private final String nombre;
    private final String apellido;
    private final String matricula;

    public Capitan(String nombre, String apellido, String matricula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }
}
