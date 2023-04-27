
//package practicoobligatorio6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarCliente extends JInternalFrame implements ActionListener {
    private JLabel lblTelefono;
    private JTextField txtTelefono;
    private JButton btnBuscar;
    private JTextArea txtResultado;
    
    private DirectorioTelefonico directorio;
    
    public BuscarCliente(DirectorioTelefonico directorio) {
        super("Buscar Cliente", true, true, true, true);
        this.directorio = directorio;
        
        // Creamos los elementos de la vista
        lblTelefono = new JLabel("Teléfono:");
        txtTelefono = new JTextField(10);
        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        txtResultado = new JTextArea(10, 40);
        txtResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtResultado);
        
        // Creamos el layout de la vista
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelBusqueda = new JPanel(new FlowLayout());
        panelBusqueda.add(lblTelefono);
        panelBusqueda.add(txtTelefono);
        panelBusqueda.add(btnBuscar);
        panel.add(panelBusqueda, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        setContentPane(panel);
        
        // Configuramos la vista
        pack();
        setLocation(150, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    // Método que se ejecuta cuando se hace click en el botón buscar
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            String telefono = txtTelefono.getText();
            Cliente cliente = directorio.buscarCliente(telefono);
            if (cliente != null) {
                txtResultado.setText("DNI: " + cliente.getDni() + "\n" +
                                      "Nombre: " + cliente.getNombre() + "\n" +
                                      "Apellido: " + cliente.getApellido() + "\n" +
                                      "Ciudad: " + cliente.getCiudad() + "\n" +
                                      "Dirección: " + cliente.getDireccion());
            } else {
                txtResultado.setText("No se encontró ningún cliente con el teléfono especificado.");
            }
        }
    }
}

