//package practicoobligatorio6;
package com.mycompany.tpdirectorio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarClientes extends JInternalFrame implements ActionListener {

    private JLabel lblTelefono;
    private JTextField txtTelefono;
    private JLabel lblDni;
    private JTextField txtDni;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JLabel lblCiudad;
    private JTextField txtCiudad;
    private JLabel lblDireccion;
    private JTextField txtDireccion;
    private JButton btnAgregar;

    private DirectorioTelefonico directorio;

    public AgregarClientes(DirectorioTelefonico directorio) {
        super("Agregar Cliente", true, true, true, true);
        this.directorio = directorio;

        // Creamos los elementos de la vista
        lblTelefono = new JLabel("Teléfono:");
        txtTelefono = new JTextField(10);
        lblDni = new JLabel("DNI:");
        txtDni = new JTextField(10);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(30);
        lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField(30);
        lblCiudad = new JLabel("Ciudad:");
        txtCiudad = new JTextField(30);
        lblDireccion = new JLabel("Dirección:");
        txtDireccion = new JTextField(50);
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);

        // Creamos el layout de la vista
        JPanel panel = new JPanel(new GridLayout(12, 2, 10, 10));
        panel.add(lblDni);
        panel.add(txtDni);
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblApellido);
        panel.add(txtApellido);
        panel.add(lblCiudad);
        panel.add(txtCiudad);
        panel.add(lblDireccion);
        panel.add(txtDireccion);
        panel.add(lblTelefono);
        panel.add(txtTelefono);
        panel.add(new JLabel(""));
        panel.add(btnAgregar);
        setContentPane(panel);

        // Configuramos la vista
        pack();
        setLocation(50, 50);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    // Método que se ejecuta cuando se hace click en el botón agregar
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            String telefono = txtTelefono.getText();
            String dni = txtDni.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String ciudad = txtCiudad.getText();
            String direccion = txtDireccion.getText();

            Cliente cliente = new Cliente(dni, nombre, apellido, ciudad, direccion, direccion);
            directorio.agregarCliente(telefono, cliente);

            JOptionPane.showMessageDialog(this, "Cliente agregado correctamente.");
            limpiarCampos();
        }
    }

    // Método que limpia los campos de texto de la vista
    private void limpiarCampos() {
        txtTelefono.setText("");
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCiudad.setText("");
        txtDireccion.setText("");
    }
}
