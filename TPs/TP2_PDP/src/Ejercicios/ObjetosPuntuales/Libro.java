package Ejercicios.ObjetosPuntuales;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor
    public Libro(String isbn, String titulo, String autor, int numPaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Método para obtener la información de ISBN, Título y Autor
    public void obtenerInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
