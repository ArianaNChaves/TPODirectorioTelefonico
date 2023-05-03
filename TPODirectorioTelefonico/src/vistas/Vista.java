
package vistas;

public class Vista extends javax.swing.JFrame {

    private DirectorioTelefonico directorio;

    public Vista(DirectorioTelefonico directorio1) {
        initComponents();
        directorio = new DirectorioTelefonico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        AgregarCliente = new javax.swing.JMenuItem();
        buscarclientes = new javax.swing.JMenuItem();
        BorrarClientes = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu2.setText("Menu");

        AgregarCliente.setText("Agregar Cliente");
        AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(AgregarCliente);

        buscarclientes.setText("Buscar Cliente");
        buscarclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclientesActionPerformed(evt);
            }
        });
        jMenu2.add(buscarclientes);

        BorrarClientes.setText("Borrar Cliente");
        BorrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarClientesActionPerformed(evt);
            }
        });
        jMenu2.add(BorrarClientes);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteActionPerformed
        AgregarClienteVista vent = new AgregarClienteVista(directorio);
        escritorio.add(vent);
        vent.show();

    }//GEN-LAST:event_AgregarClienteActionPerformed

    private void buscarclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarclientesActionPerformed
        BuscarCliente vent = new BuscarCliente(directorio);
        escritorio.add(vent);
        vent.show();
    }//GEN-LAST:event_buscarclientesActionPerformed

    private void BorrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarClientesActionPerformed
        BorrarCliente vent = new BorrarCliente(directorio);
        escritorio.add(vent);
        vent.show();
    }//GEN-LAST:event_BorrarClientesActionPerformed

    public static void main(String args[]) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        AgregarClienteVista vistaAgregar = new AgregarClienteVista(directorio);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista(directorio).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarCliente;
    private javax.swing.JMenuItem BorrarClientes;
    private javax.swing.JMenuItem buscarclientes;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
