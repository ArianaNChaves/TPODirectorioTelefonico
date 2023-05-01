
//package practicoobligatorio6;
package com.mycompany.tpdirectorio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorrarCliente extends JInternalFrame implements ActionListener {
    private JLabel lblTelefono;
    private JTextField txtTelefono;
    private JButton btnBorrar;
    
    private DirectorioTelefonico directorio;
    
    public BorrarCliente(DirectorioTelefonico directorio) {
        super("Borrar Cliente", true, true, true, true);
        this.directorio = directorio;
        
        // Creamos los elementos de la vista
        lblTelefono = new JLabel("Teléfono:");
        txtTelefono = new JTextField(10);
        btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(this);
        
        // Creamos el layout de la vista
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(lblTelefono);
        panel.add(txtTelefono);
        panel.add(btnBorrar);
        setContentPane(panel);
        
        // Configuramos la vista
        pack();
        setLocation(150, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    // Método que se ejecuta cuando se hace click en el botón borrar
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBorrar) {
            String telefono = txtTelefono.getText();
            boolean borrado = directorio.borrarCliente(telefono);
            if (borrado) {
                JOptionPane.showMessageDialog(this, "El cliente ha sido borrado correctamente.",
                                              "Cliente borrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo encontrar el cliente con el número de teléfono especificado en el directorio.",
                                              "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


