package Formulario_Reserva;

import Reserva_vuelos.Vuelos;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class ForBuscar extends javax.swing.JFrame {

    ForDatosCliente formDatosCliente;
    ArrayList<Vuelos> listVuelos;
    
      
    public ForBuscar(ArrayList<Vuelos> listVuelos) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        formDatosCliente = new ForDatosCliente();

        this.listVuelos = listVuelos;

    }

    public void setListVuelos(ArrayList<Vuelos> listVuelos) {
        this.listVuelos = listVuelos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesVuelos = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblOrigen = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        lblFsalida = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtFsalida = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        VueloDisponible1 = new javax.swing.JTextField();
        VueloDisponible2 = new javax.swing.JTextField();
        VueloDisponible3 = new javax.swing.JTextField();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        ParaReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18), new java.awt.Color(0, 0, 102))); // NOI18N

        lblOrigen.setText("Origen");

        lblFsalida.setText("Fecha de Salida ");

        lblDestino.setText("Destino");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        VueloDisponible1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VueloDisponible1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        VueloDisponible1.setEnabled(false);

        VueloDisponible2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VueloDisponible2.setEnabled(false);

        VueloDisponible3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VueloDisponible3.setEnabled(false);

        OpcionesVuelos.add(opcion1);
        opcion1.setText("Opción 1");

        OpcionesVuelos.add(opcion2);
        opcion2.setText("Opción 2");

        OpcionesVuelos.add(opcion3);
        opcion3.setText("Opción 3");

        ParaReserva.setText("Siguiente ->");
        ParaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaReservaActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(lblOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblFsalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtFsalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(VueloDisponible1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(VueloDisponible2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(VueloDisponible3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(opcion1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(opcion2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(opcion3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ParaReserva, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFsalida))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDestino)
                            .addComponent(lblOrigen))))
                .addGap(14, 14, 14)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFsalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VueloDisponible1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(VueloDisponible3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VueloDisponible2, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnBuscar)
                .addGap(179, 179, 179)
                .addComponent(opcion1)
                .addGap(36, 36, 36)
                .addComponent(opcion2)
                .addGap(59, 59, 59)
                .addComponent(opcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(ParaReserva)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino))
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFsalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(VueloDisponible1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VueloDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VueloDisponible3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1)
                    .addComponent(opcion2)
                    .addComponent(opcion3)
                    .addComponent(ParaReserva))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.getAccessibleContext().setAccessibleName("Buscar Vuelos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        
        String buscarOrigen = txtOrigen.getText().trim();
        boolean existeOrigen = false;
        
        String buscarDestino = txtDestino.getText().trim();
        boolean existeDestino = false;
        
        String buscarFsalida = txtFsalida.getText().trim();
        boolean existeFsalida = false;
        
        int k=1;
        
        for (int i = 0; i < listVuelos.size(); i++) {
            
            Vuelos Ruta = listVuelos.get(i);
            String aux1=Ruta.getOrigen();
            String aux2=Ruta.getDestino();
            String aux3=Ruta.getFechaVuelo();
            String aux4=Ruta.getHora();
            String aux5=Ruta.getValorTiquete();
            String aux6=Ruta.getNumeroVuelo();
            
                        
            if (aux1.equals(buscarOrigen) && aux2.equals(buscarDestino) && aux3.equals(buscarFsalida)) {
                
                //txtOrigen.setText(aux1);
                existeOrigen = true;
                //txtDestino.setText(aux2);
                existeDestino = true;
                //txtFsalida.setText(aux3);
                existeFsalida = true;
                
                if (k==1){
                    VueloDisponible1.setText("Opción 1: Fecha de vuelo: "+aux3+" Hora de Vuelo: "+aux4+" Valor del tiquete: "+aux5);
                    VueloDisponible1.setEditable(false);
                            
                }
                if (k==2){
                    VueloDisponible2.setText("Opción 2:  Fecha de vuelo: "+aux3+" Hora de Vuelo: "+aux4+" Valor del tiquete: "+aux5);
                    VueloDisponible2.setEditable(false);
                 
                }
                if (k==3){
                    VueloDisponible3.setText("Opción 3:  Fecha de vuelo: "+aux3+" Hora de Vuelo: "+aux4+" Valor del tiquete: "+aux5);
                    VueloDisponible3.setEditable(false);
                   
                }
                
                k++;
                //JOptionPane.showMessageDialog(this, "Vuelo disponible con este origen: "+aux1+"  Destino: "+aux2+"  Con fecha: "+aux3);
            }
        }
        if (!existeOrigen | !existeDestino | !existeFsalida) {
            JOptionPane.showMessageDialog(this, " No hay vuelo disponible con este origen ");            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
int itembusqueda;
    private void ParaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaReservaActionPerformed
   
        
        
        String Origen="";
        String Destino="";
        String FechaVuelo="";
        String HoraVuelo="";
        String ValorTiquete="";
        String NumeroVuelo="";
        
        if (opcion1.isSelected()) {
            itembusqueda=1;
            
        } else if (opcion2.isSelected()) {
            itembusqueda=2;
        } else if (opcion3.isSelected()) {
            itembusqueda=3;
        }
        
        String buscarOrigen = txtOrigen.getText();
        boolean existeOrigen = false;
        
        String buscarDestino = txtDestino.getText();
        boolean existeDestino = false;
        
        String buscarFsalida = txtFsalida.getText();
        boolean existeFsalida = false;
        
        int k=1;
        
        for (int i = 0; i < listVuelos.size(); i++) {
            
            Vuelos Ruta = listVuelos.get(i);
            String aux1=Ruta.getOrigen();
            String aux2=Ruta.getDestino();
            String aux3=Ruta.getFechaVuelo();
            String aux4=Ruta.getHora();
            String aux5=Ruta.getValorTiquete();
            String aux6=Ruta.getNumeroVuelo();
                                    
            if (aux1.equals(buscarOrigen) && aux2.equals(buscarDestino) && aux3.equals(buscarFsalida)) {
                existeOrigen = true;
                existeDestino = true;
                existeFsalida = true;
                
                if (k==itembusqueda){
                    Origen=aux1;
                    Destino=aux2;
                    FechaVuelo=aux3;
                    HoraVuelo=aux4;
                    ValorTiquete=aux5;
                    NumeroVuelo=aux6;
                    JOptionPane.showMessageDialog(this, "Vuelo seleccionado con origen: "+Origen+"  Destino: "+Destino+"  Con fecha: "+FechaVuelo+" Hora de vuelo: "+HoraVuelo);
  
                }
                
                k++;
                
            }
        }
    formDatosCliente.setVisible(true);
    this.setVisible(false);
    
    ForDatosCliente.ReservaOrigen.setText(Origen);
    ForDatosCliente.ReservaDestino.setText(Destino);
    ForDatosCliente.ReservaFechaVuelo.setText(FechaVuelo);
    ForDatosCliente.ReservaHoraVuelo.setText(HoraVuelo);
    ForDatosCliente.valortiquete.setText(ValorTiquete);
    ForDatosCliente.ReservaNumeroVuelo.setText(NumeroVuelo);
    
        if ("HK001".equals(NumeroVuelo)){
            ForDatosCliente.numerosilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1A", "1B"}));
        }
        if ("HK002".equals(NumeroVuelo)){
            ForDatosCliente.numerosilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1A", "1B", "2A", "2B"}));
        }
        if ("HK003".equals(NumeroVuelo)){
            ForDatosCliente.numerosilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1A", "1B", "2A", "2B", "3A", "3B"}));
        }
        if ("HK004".equals(NumeroVuelo)){
            ForDatosCliente.numerosilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1A", "1B", "2A", "2B", "3A", "3B", "4A", "4B" }));
        }
        if ("HK005".equals(NumeroVuelo)){
            ForDatosCliente.numerosilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1A", "1B", "2A", "2B","3A", "3B", "4A", "4B","5A", "5B"}));
        }

        
        
    }//GEN-LAST:event_ParaReservaActionPerformed

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
            java.util.logging.Logger.getLogger(ForBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ForBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup OpcionesVuelos;
    private javax.swing.JButton ParaReserva;
    private javax.swing.JTextField VueloDisponible1;
    private javax.swing.JTextField VueloDisponible2;
    private javax.swing.JTextField VueloDisponible3;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblFsalida;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFsalida;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
