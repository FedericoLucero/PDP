public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;

    // Constructor
    public Persona(String nombre, int edad, String genero, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ocupacion = ocupacion;
    }

    // Métodos propios
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    public void trabajar() {
        System.out.println("Estoy trabajando como " + ocupacion + ".");
    }

    public void descansar() {
        System.out.println("Voy a descansar un rato.");
    }

    // Getters y setters
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
