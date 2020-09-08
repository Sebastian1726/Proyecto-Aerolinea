package Formulario_Reserva;

import Reserva_vuelos.Reserva;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ForMenu extends javax.swing.JFrame {

    ArrayList<Reserva> ListaReserva;
    String buscarReserva = " ";

    ForAdmin formAdmin;
    ForBuscar formBuscar;
    ForDatosCliente formDatosCliente;

    public ForMenu(ArrayList<Reserva> ListReserva) {
        initComponents();
        this.setLocationRelativeTo(null);

        formAdmin = new ForAdmin();
        formDatosCliente = new ForDatosCliente();
        formBuscar = new ForBuscar(formAdmin.getListaVuelos());

        this.ListaReserva = ListReserva;
    }

    public ArrayList<Reserva> getListaReserva() {
        return ListaReserva;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnRealizarReserva = new javax.swing.JButton();
        btnConsultarReservas = new javax.swing.JButton();
        btnEliminarReservas = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        btnAdminRV = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18), new java.awt.Color(0, 0, 102))); // NOI18N

        btnRealizarReserva.setText("REALIZAR RESERVA");
        btnRealizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarReservaActionPerformed(evt);
            }
        });

        btnConsultarReservas.setText("CONSULTAR RESERVA");
        btnConsultarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarReservasActionPerformed(evt);
            }
        });

        btnEliminarReservas.setText("ELIMINAR RESERVA");
        btnEliminarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReservasActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(btnRealizarReserva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnConsultarReservas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnEliminarReservas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRealizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnConsultarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(btnEliminarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(btnRealizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrador de Rutas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 15), new java.awt.Color(0, 0, 102))); // NOI18N

        btnAdminRV.setText("AGREGAR VUELOS Y AVIONES ");
        btnAdminRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminRVActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(btnAdminRV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(btnAdminRV)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addContainerGap())))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnAdminRV, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2))
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarReservaActionPerformed
        formBuscar.setListVuelos(formAdmin.getListaVuelos());
        formBuscar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRealizarReservaActionPerformed

    private void btnAdminRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminRVActionPerformed
        formAdmin.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnAdminRVActionPerformed

    private void btnConsultarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarReservasActionPerformed

        buscarReserva = JOptionPane.showInputDialog(this, "Digite el numero de reserva: ");
        boolean existeReserva = false;

        //ArrayList<Reserva> ListaReserva;
        ListaReserva = getListaReserva();

        //JOptionPane.showMessageDialog(this,ListaReserva.size());
        String mensaje = "No Existe Reserva ";

        for (int i = 0; i < ListaReserva.size(); i++) {
            Reserva Auxiliar = ListaReserva.get(i);

            String auxReserva = Auxiliar.getNumeroReserva();
            String auxOrigen = Auxiliar.getOrigen();
            String auxDestino = Auxiliar.getDestino();
            String auxHoraVuelo = Auxiliar.getHoraVuelo();
            String auxFechaVuelo = Auxiliar.getFechaVuelo();
            String auxNumeroSilla = Auxiliar.getNumeroSilla();
            String auxNumeroVuelo = Auxiliar.getNumeroVuelo();
            String auxValorTiquete = Auxiliar.getValorTiquete();
            String auxNombreCliente = Auxiliar.getNombreCliente();
            String auxApellidoCliente = Auxiliar.getApellidoCliente();
            String auxFechaNacimiento = Auxiliar.getFechaNacimiento();
            String auxCedula = Auxiliar.getCedula();
            String auxTelefonoContacto = Auxiliar.getTelefonoContacto();
            String auxCelularContacto = Auxiliar.getCelularContacto();
            String auxEmailContacto = Auxiliar.getEmailContacto();
            String auxFechaCompra = Auxiliar.getFechaCompra();
            String auxOpcionPago = Auxiliar.getOpcionPago();

            //JOptionPane.showMessageDialog(this,mensaje);
            if (auxReserva.equals(buscarReserva)) {
                existeReserva = true;
                mensaje = "\n         DATOS DE LA RESERVA      \n"
                        + "\nNumero de Reserva: " + auxReserva
                        + "\nOrigen: " + auxOrigen
                        + "\nDestino: " + auxDestino
                        + "\nHora Vuelo: " + auxHoraVuelo
                        + "\nFecha Vuelo: " + auxFechaVuelo
                        + "\nNumero de Silla: " + auxNumeroSilla
                        + "\nNumero de Vuelo: " + auxNumeroVuelo
                        + "\nValor Tiquete: " + auxValorTiquete
                        + "\nNombre Cliente: " + auxNombreCliente
                        + "\nApellido Cliente : " + auxApellidoCliente
                        + "\nFecha de Nacimiento: " + auxFechaNacimiento
                        + "\nCedula: " + auxCedula
                        + "\nTelefono de Contacto: " + auxTelefonoContacto
                        + "\nCelular de Contacto: " + auxCelularContacto
                        + "\nEmail de Contacto: " + auxEmailContacto
                        + "\nFecha de Compra: " + auxFechaCompra
                        + "\nOpcio de Pago : " + auxOpcionPago;
            }

        }

        JOptionPane.showMessageDialog(this, mensaje);


    }//GEN-LAST:event_btnConsultarReservasActionPerformed

    private void btnEliminarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReservasActionPerformed
        buscarReserva = JOptionPane.showInputDialog(this, "Digite el numero de reserva: ");
        boolean existeReserva = false;

        //JOptionPane.showMessageDialog(this,ListaReserva.size());
        String mensaje = " ";

        for (int i = 0; i < ListaReserva.size(); i++) {
            Reserva Auxiliar = ListaReserva.get(i);

            String auxReserva = Auxiliar.getNumeroReserva();

            //JOptionPane.showMessageDialog(this,mensaje);
            if (auxReserva.equals(buscarReserva)) {
                ListaReserva.remove(i);
                mensaje = "Reserva Eliminada";
                break;
            }
        }
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnEliminarReservasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ForMenu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminRV;
    public static javax.swing.JButton btnConsultarReservas;
    private javax.swing.JButton btnEliminarReservas;
    private javax.swing.JButton btnRealizarReserva;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    // End of variables declaration//GEN-END:variables
}
