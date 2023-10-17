public class Arbol {
    private int altura;
    private String nombre;

    public Arbol(int altura) {
        this.altura = altura;
        System.out.println("Se ha creado un árbol con altura " + altura + ".");
    }
    public Arbol(String nombre) {
        this.nombre = nombre;
        System.out.println("Se ha creado un árbol con nombre " + nombre + ".");
    }
    public Arbol() {
        System.out.println("Se ha creado un árbol genérico.");
    }
    public Arbol(int altura, String nombre) {
        this.altura = altura;
        this.nombre = nombre;
        System.out.println("Se ha creado un árbol con altura " + altura + " y nombre " + nombre + ".");
    }
}
