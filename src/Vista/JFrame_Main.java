package Vista;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Pablo
 */
public class JFrame_Main extends javax.swing.JFrame {

    /**
     * Creates new form Eleccion
     */
    public JFrame_Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Seleccion_Gama = new javax.swing.JButton();
        Seleccion_Producto = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Seleccion_Gama.setBackground(new java.awt.Color(204, 204, 204));
        Seleccion_Gama.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        Seleccion_Gama.setText("GAMA");
        Seleccion_Gama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, null, null));
        Seleccion_Gama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seleccion_Gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion_GamaActionPerformed(evt);
            }
        });
        jPanel2.add(Seleccion_Gama, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 200, 80));

        Seleccion_Producto.setBackground(new java.awt.Color(204, 204, 204));
        Seleccion_Producto.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        Seleccion_Producto.setText("PRODUCTOS");
        Seleccion_Producto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, null, null));
        Seleccion_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seleccion_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion_ProductoActionPerformed(evt);
            }
        });
        jPanel2.add(Seleccion_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 200, 80));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/MEROY.jpg"))); // NOI18N
        jPanel2.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Seleccion_GamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion_GamaActionPerformed
        JFrame_Buscar_Gama buscar_Gama = new JFrame_Buscar_Gama();
        buscar_Gama.setVisible(true);
    }//GEN-LAST:event_Seleccion_GamaActionPerformed

    private void Seleccion_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion_ProductoActionPerformed
        JFrame_Buscar_Producto buscar_Producto = new JFrame_Buscar_Producto();
        buscar_Producto.setVisible(true);
    }//GEN-LAST:event_Seleccion_ProductoActionPerformed

    public JFrame_Main(JFrame_Buscar_Producto buscar_Producto, JButton Seleccion_Gama, JButton Seleccion_Producto, JLabel jLabel2, JPanel jPanel1) throws HeadlessException {
        this.buscar_Producto = buscar_Producto;
        this.Seleccion_Gama = Seleccion_Gama;
        this.Seleccion_Producto = Seleccion_Producto;
        this.FONDO = jLabel2;

    }
    public JFrame_Buscar_Producto buscar_Producto;

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
            java.util.logging.Logger.getLogger(JFrame_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton Seleccion_Gama;
    private javax.swing.JButton Seleccion_Producto;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
