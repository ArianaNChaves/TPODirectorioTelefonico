
//package practicoobligatorio6;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DirectorioTelefonicoApp extends JFrame implements ActionListener {
    private DirectorioTelefonico directorio;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItemAgregar;
    private JMenuItem menuItemBuscar;
    private JMenuItem menuItemBorrar;

    public DirectorioTelefonicoApp() {
        super("Directorio Telefónico");
        directorio = new DirectorioTelefonico();

        // Creamos el menú y sus opciones
        menuBar = new JMenuBar();
        menu = new JMenu("Opciones");
        menuItemAgregar = new JMenuItem("Agregar Cliente");
        menuItemBuscar = new JMenuItem("Buscar Cliente");
        menuItemBorrar = new JMenuItem("Borrar Cliente");

        menuItemAgregar.addActionListener(this);
        menuItemBuscar.addActionListener(this);
        menuItemBorrar.addActionListener(this);

        menu.add(menuItemAgregar);
        menu.add(menuItemBuscar);
        menu.add(menuItemBorrar);
        menuBar.add(menu);

        // Configuramos la ventana
        setJMenuBar(menuBar);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Método que se ejecuta cuando se selecciona una opción del menú
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItemAgregar) {
            AgregarClientes agregarClientes = new AgregarClientes(directorio);
            getContentPane().add(agregarClientes);
            agregarClientes.setVisible(true);
        } else if (e.getSource() == menuItemBuscar) {
            BuscarCliente vistaBuscar = new BuscarCliente(directorio);
            getContentPane().add(vistaBuscar);
            vistaBuscar.setVisible(true);
        } else if (e.getSource() == menuItemBorrar) {
            BorrarCliente vistaBorrar = new BorrarCliente(directorio);
            getContentPane().add(vistaBorrar);
            vistaBorrar.setVisible(true);
        }
    }

    public static void main(String[] args) {
        DirectorioTelefonicoApp app = new DirectorioTelefonicoApp();
    }
}

