package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz extends JFrame {

    public interfaz() {
        // Configurar el marco principal
        setTitle("Ejemplo de barra de menú en Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear la barra de menú principal
        JMenuBar menuBar = new JMenuBar();

        // Crear los menús principales
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEditar = new JMenu("Editar");
        JMenu menuAyuda = new JMenu("Ayuda");

        // Crear los elementos del menú Archivo
        JMenuItem nuevoArchivo = new JMenuItem("Nuevo");
        JMenuItem abrirArchivo = new JMenuItem("Abrir");
        JMenuItem guardarArchivo = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");

        // Añadir los elementos al menú Archivo con un separador
        menuArchivo.add(nuevoArchivo);
        menuArchivo.add(abrirArchivo);
        menuArchivo.add(guardarArchivo);
        menuArchivo.addSeparator();
        menuArchivo.add(salir);

        // Crear los elementos del menú Editar
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem cortar = new JMenuItem("Cortar");

        // Añadir los elementos al menú Editar
        menuEditar.add(copiar);
        menuEditar.add(pegar);
        menuEditar.add(cortar);

        // Crear los elementos del menú Ayuda
        JMenuItem acercaDe = new JMenuItem("Acerca de");

        // Añadir los elementos al menú Ayuda
        menuAyuda.add(acercaDe);

        // Añadir los menús principales a la barra de menú
        menuBar.add(menuArchivo);
        menuBar.add(menuEditar);
        menuBar.add(menuAyuda);

        // Añadir la barra de menú al marco
        setJMenuBar(menuBar);

        // Definir acciones para cada elemento de menú
        nuevoArchivo.addActionListener(e -> System.out.println("Nuevo archivo creado"));
        abrirArchivo.addActionListener(e -> System.out.println("Archivo abierto"));
        guardarArchivo.addActionListener(e -> System.out.println("Archivo guardado"));
        salir.addActionListener(e -> {
            System.out.println("Saliendo de la aplicación");
            dispose();
        });

        copiar.addActionListener(e -> System.out.println("Texto copiado"));
        pegar.addActionListener(e -> System.out.println("Texto pegado"));
        cortar.addActionListener(e -> System.out.println("Texto cortado"));

        acercaDe.addActionListener(e -> System.out.println("Acerca de esta aplicación"));

        // Configurar el layout del contenido
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // Mostrar el marco
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(interfaz::new);
    }
}
