package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

public class BuscarCliente extends javax.swing.JInternalFrame {

    private DirectorioTelefonico directorio;

    public BuscarCliente(DirectorioTelefonico directorio) {
        initComponents();
        this.directorio = directorio;
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String telefono = campoTelefono.getText();
                Cliente cliente = directorio.buscarCliente(telefono);
                if (cliente != null) {
                    txtmostrardatos.setText("DNI: " + cliente.getDni() + "\n"
                            + "Nombre: " + cliente.getNombre() + "\n"
                            + "Apellido: " + cliente.getApellido() + "\n"
                            + "Ciudad: " + cliente.getCiudad() + "\n"
                            + "Dirección: " + cliente.getDireccion() + "\n"
                            + "Telefono: " + telefono);
                    JOptionPane.showMessageDialog(null, "Cliente encontrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    txtmostrardatos.setText("");
                }
            }
        });
        btnBuscarTelefono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String apellido = txtResultados.getText();
                List<String> telefonos = directorio.buscarTelefono(apellido);
                if (!telefonos.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Teléfonos encontrados para el apellido " + apellido + ":\n");
                    for (String telefono : telefonos) {
                        sb.append(telefono).append("\n");
                    }
                    txtmostrardatos.setText(sb.toString());
                } else {
                    txtmostrardatos.setText("No se encontraron teléfonos para el apellido " + apellido);
                }
            }
        });
        btnBuscarClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String ciudad = txtResultadosciudad.getText();
                String telefono = campoTelefono.getText();
                List<Cliente> clientes = directorio.buscarClientes(ciudad);
                if (!clientes.isEmpty()) {
                    txtResultados.setText("Clientes encontrados en la ciudad de " + ciudad + ":\n");
                    for (Cliente cliente : clientes) {
                        txtmostrardatos.setText(txtResultados.getText() + "Nombre: " + cliente.getNombre() + " " + cliente.getApellido() + "\n"
                                + "Teléfono: " + telefono + "\n"
                                + "Dirección: " + cliente.getDireccion() + "\n\n");
                    }
                } else {
                    txtmostrardatos.setText("No se encontraron clientes en la ciudad de " + ciudad);
                }

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmostrardatos = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtResultados = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtResultadosciudad = new javax.swing.JTextField();
        btnBuscarTelefono = new javax.swing.JButton();
        btnBuscarClientes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Cliente");

        jLabel1.setText("Numero de telefono:");

        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        txtmostrardatos.setColumns(20);
        txtmostrardatos.setRows(5);
        jScrollPane1.setViewportView(txtmostrardatos);

        btnBuscar.setText("Buscar");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Ciudad:");

        btnBuscarTelefono.setText("Buscar");
        btnBuscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelefonoActionPerformed(evt);
            }
        });

        btnBuscarClientes.setText("Buscar");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtResultados)
                            .addComponent(txtResultadosciudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(btnBuscarTelefono)
                            .addComponent(btnBuscarClientes))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarTelefono)
                    .addComponent(txtResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtResultadosciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed

    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void btnBuscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarClientes;
    private javax.swing.JButton btnBuscarTelefono;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtResultados;
    private javax.swing.JTextField txtResultadosciudad;
    private javax.swing.JTextArea txtmostrardatos;
    // End of variables declaration//GEN-END:variables
}
