import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InterfazGraficaBasica extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Configurar la ventana
        primaryStage.setTitle("Interfaz Gráfica Básica");

        // Crear un botón
        Button btn = new Button("Haz clic");

        // Configurar el evento de clic del botón
        btn.setOnAction(e -> {
            System.out.println("¡Botón clickeado!");
        });

        // Crear un contenedor y agregar el botón
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Crear la escena
        Scene scene = new Scene(root, 300, 250);

        // Configurar la escena en la ventana y mostrarla
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
