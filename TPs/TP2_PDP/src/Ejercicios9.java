public class Ejercicios9 {
    public static void main(String[] args) {

        // Ejercicio 9.1
        // Crea una instancia de Persona
        Persona persona1 = new Persona("Ana", 30, "Femenino", "Ingeniera");

        // Usa los métodos de Persona
        persona1.saludar();
        persona1.cumplirAnios();
        persona1.trabajar();
        persona1.descansar();



        // Ejercicio 9.2
        // Crea una instancia de P1 y P2
        Punto P1 = new Punto(10,0);
        Punto P2 = new Punto(0,0);

        // Usa los métodos para Calcular la distancia entre dos puntos
        System.out.println("\ndistancia entre dos puntos " + P1.calcularDistancia(P2));



        // Ejercicio 9.3
        // Crea dos instancias de Sumatoria
        Sumatoria sumatoria1 = new Sumatoria();
        Sumatoria sumatoria2 = new Sumatoria(3, 7);

        // Usa los métodos para Mostrar las tablas de multiplicar
        System.out.println("\nTabla de multiplicar para sumatoria1:");
        sumatoria1.mostrarTablaDeMultiplicar();

        System.out.println("\nTabla de multiplicar para sumatoria2:");
        sumatoria2.mostrarTablaDeMultiplicar();

        // Usa los métodos para Calcular y mostrar la suma de ambas variables
        System.out.println("\nSuma para sumatoria1:");
        sumatoria1.calcularSuma();
        System.out.println("Suma para sumatoria2:");
        sumatoria2.calcularSuma();



        // Ejercicio 9.4
        // Crear 5 instancias de la clase Libro
        Libro libro1 = new Libro("978-0451524935", "Moby-Dick", "Herman Melville", 635);
        Libro libro2 = new Libro("978-1982141512", "To Kill a Mockingbird", "Harper Lee", 336);
        Libro libro3 = new Libro("978-0743273565", "The Great Gatsby", "F. Scott Fitzgerald", 180);
        Libro libro4 = new Libro("978-0061120084", "1984", "George Orwell", 328);
        Libro libro5 = new Libro("978-1400083812", "The Catcher in the Rye", "J.D. Salinger", 277);

        // Usa los métodos para Obtener la información de los libros
        System.out.println("\nInformación del libro 1:");
        libro1.obtenerInformacion();

        System.out.println("\nInformación del libro 2:");
        libro2.obtenerInformacion();

        System.out.println("\nInformación del libro 3:");
        libro3.obtenerInformacion();

        System.out.println("\nInformación del libro 4:");
        libro4.obtenerInformacion();

        System.out.println("\nInformación del libro 5:");
        libro5.obtenerInformacion();

        System.out.println("");


        // Ejercicio 9.5
        // Crear 2 instancias para dos fracciones
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);

        // Usa los métodos para realizar las operaciones
        fraccion1.sumar(fraccion2);
        fraccion1.restar(fraccion2);
        fraccion1.multiplicar(fraccion2);
        fraccion1.dividir(fraccion2);
    }
}
