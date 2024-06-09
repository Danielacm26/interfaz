## Aplicación interfaz
Esta es una aplicación  que muestra cómo implementar una barra de menú en una ventana. La aplicación incluye menús para Archivo, Editar y Ayuda, cada uno con varios elementos de menú.

## Características
- Menú Archivo: Permite crear un nuevo archivo, abrir un archivo, guardar un archivo y salir de la aplicación.
- Menú Editar: Incluye opciones para copiar, pegar y cortar texto.
- Menú Ayuda: Proporciona una opción para mostrar información acerca de la aplicación.

## Resumen del Código
Clase: interfaz
La clase interfaz extiende JFrame e implementa la interfaz de usuario y la lógica para la aplicación.

## Constructor
El constructor configura el marco principal, crea la barra de menú y añade los elementos de menú correspondientes. También define las acciones para cada elemento de menú.

# resultado
[![Captura-de-pantalla-227.png](https://i.postimg.cc/GtV7fzJ1/Captura-de-pantalla-227.png)](https://postimg.cc/WqmwFGH9)
[![Captura-de-pantalla-229.png](https://i.postimg.cc/VL0HtQms/Captura-de-pantalla-229.png)](https://postimg.cc/RN9RrYW2)
[![Captura-de-pantalla-230.png](https://i.postimg.cc/XYM1cHYf/Captura-de-pantalla-230.png)](https://postimg.cc/PP4MdMZJ)

## codigo

package interfaz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Interfaz extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear la barra de menú principal
        MenuBar menuBar = new MenuBar();

        // Crear los menús principales
        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");

        // Crear los elementos del menú Archivo
        MenuItem nuevoArchivo = new MenuItem("Nuevo");
        MenuItem abrirArchivo = new MenuItem("Abrir");
        MenuItem guardarArchivo = new MenuItem("Guardar");
        MenuItem salir = new MenuItem("Salir");

        // Añadir los elementos al menú Archivo con un separador
        menuArchivo.getItems().addAll(nuevoArchivo, abrirArchivo, guardarArchivo, new SeparatorMenuItem(), salir);

        // Crear los elementos del menú Editar
        MenuItem copiar = new MenuItem("Copiar");
        MenuItem pegar = new MenuItem("Pegar");
        MenuItem cortar = new MenuItem("Cortar");

        // Añadir los elementos al menú Editar
        menuEditar.getItems().addAll(copiar, pegar, cortar);

        // Crear los elementos del menú Ayuda
        MenuItem acercaDe = new MenuItem("Acerca de");

        // Añadir los elementos al menú Ayuda
        menuAyuda.getItems().add(acercaDe);

        // Añadir los menús principales a la barra de menú
        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        // Definir acciones para cada elemento de menú
        nuevoArchivo.setOnAction(e -> System.out.println("Nuevo archivo creado"));
        abrirArchivo.setOnAction(e -> System.out.println("Archivo abierto"));
        guardarArchivo.setOnAction(e -> System.out.println("Archivo guardado"));
        salir.setOnAction(e -> {
            System.out.println("Saliendo de la aplicación");
            primaryStage.close();
        });

        copiar.setOnAction(e -> System.out.println("Texto copiado"));
        pegar.setOnAction(e -> System.out.println("Texto pegado"));
        cortar.setOnAction(e -> System.out.println("Texto cortado"));

        acercaDe.setOnAction(e -> System.out.println("Acerca de esta aplicación"));

        // Utilizar un BorderPane para organizar la barra de menú en la parte superior
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Crear la escena y añadir el BorderPane
        Scene scene = new Scene(root, 400, 300);

        // Configurar y mostrar el escenario principal
        primaryStage.setTitle("Ejemplo de barra de menú en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

