/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import modelos.GamaProducto;

/**
 *
 * @author Pablo Grimao Company
 */
public class JFrame_Gestion_Gama extends javax.swing.JFrame implements Interfaz {

    int Seleccion_btn;
    JFrame_Buscar_Gama Buscar_Gama;
    GamaProducto GamaProducto;

    /**
     * Creates new form Modificar_Mostrar_Anadir
     */
    public JFrame_Gestion_Gama(int Seleccion, GamaProducto Gama) {
        initComponents();
        setDefaultCloseOperation(JFrame_Buscar_Gama.DISPOSE_ON_CLOSE);
        Buscar_Gama = new JFrame_Buscar_Gama();
        GamaProducto = Gama;
        Seleccion_btn = Seleccion;

        switch (Seleccion) {
            case 1:
                Muestra_Anadir();

                break;
            case 2:
               
                Muestra_Modificar();
                break;
            case 3:
                Muestraa_Mostrar();
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Cerrar_Gama = new javax.swing.JToggleButton();
        Btn_Gestion_Gama = new javax.swing.JToggleButton();
        JT_Gama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Descripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTHTML = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTIMG = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel1.setText("Gama:");

        btn_Cerrar_Gama.setText("Cerrar");
        btn_Cerrar_Gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cerrar_GamaActionPerformed(evt);
            }
        });

        Btn_Gestion_Gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestion_GamaActionPerformed(evt);
            }
        });

        JT_Gama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        JT_Descripcion.setColumns(20);
        JT_Descripcion.setRows(5);
        jScrollPane1.setViewportView(JT_Descripcion);

        JTHTML.setColumns(20);
        JTHTML.setRows(5);
        jScrollPane2.setViewportView(JTHTML);

        JTIMG.setColumns(20);
        JTIMG.setRows(5);
        jScrollPane3.setViewportView(JTIMG);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel2.setText("HTML:");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel3.setText("Imagen:");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel4.setText("Descipción:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Cerrar_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(Btn_Gestion_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JT_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3)))
                .addGap(0, 115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cerrar_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Gestion_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cerrar_GamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cerrar_GamaActionPerformed
        Cerrar();
    }//GEN-LAST:event_btn_Cerrar_GamaActionPerformed

    private void Btn_Gestion_GamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestion_GamaActionPerformed

        switch (Seleccion_btn) {
            case 1:
                Anadir();

                break;
            case 2:

                Modificar();

                break;

        }
    }//GEN-LAST:event_Btn_Gestion_GamaActionPerformed
    private void Modificar() {

        String gama = JT_Gama.getText().trim();
        String Desc = JT_Descripcion.getText().trim();
        String HTML = JTHTML.getText().trim();
        String IMG = JTIMG.getText().trim();
        Object[] o = {gama, Desc, HTML, IMG};
        Gama_DAO.actualizar(o);
        GamaProducto.setDescripcion_texto(Desc);
        GamaProducto.setDescripcion_html(HTML);
        GamaProducto.setImagen(IMG);
        Cerrar();

    }

  private void Anadir() {

    JT_Gama.setEditable(true);
    String gama = JT_Gama.getText().trim();
    String Desc = JT_Descripcion.getText().trim();
    String HTML = JTHTML.getText().trim();
    String IMG = JTIMG.getText().trim();

    // Verificar si la gama ya existe
    for (GamaProducto producto : Buscar_Gama.Array_Gama_Productos) {
        if (producto.getGama().equalsIgnoreCase(gama)) {
            JOptionPane.showMessageDialog(null, "Ya existe una gama con ese nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si la gama ya existe
        }
    }

    // Si no existe, proceder con la adición
    Object[] o = {gama, Desc, HTML, IMG};
    Gama_DAO.agregar(o);
    GamaProducto aux = new GamaProducto(gama, Desc, HTML, IMG);
    Buscar_Gama.Array_Gama_Productos.add(aux);
    Buscar_Gama.filtrar();
    Cerrar();
}



    public void Muestra_Anadir() {
        Btn_Gestion_Gama.setVisible(true);
        JT_Gama.setEditable(true);
        JT_Descripcion.setEditable(true);
        JTHTML.setEditable(true);
        JTIMG.setEditable(true);

    }

    public void Muestra_Modificar() {
        Btn_Gestion_Gama.setVisible(true);
        JT_Gama.setText(GamaProducto.getGama());
        JT_Descripcion.setText(GamaProducto.getDescripcion_texto());
        JTHTML.setText(GamaProducto.getDescripcion_html());
        JTIMG.setText(GamaProducto.getImagen());
        JT_Gama.setEditable(false);
        JT_Descripcion.setEditable(true);
        JTHTML.setEditable(true);
        JTIMG.setEditable(true);

    }

    public void Muestraa_Mostrar() {
        Btn_Gestion_Gama.setVisible(false);
        JT_Gama.setText(GamaProducto.getGama());
        JT_Descripcion.setText(GamaProducto.getDescripcion_texto());
        JTHTML.setText(GamaProducto.getDescripcion_html());
        JTIMG.setText(GamaProducto.getImagen());
        JT_Gama.setEditable(false);
        JT_Descripcion.setEditable(false);
        JTHTML.setEditable(false);
        JTIMG.setEditable(false);

    }

    public void cambio() {

    }

    public JToggleButton getBtn_Gestion_Gama() {
        return Btn_Gestion_Gama;
    }

    private void Cerrar() {
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Btn_Gestion_Gama;
    private javax.swing.JTextArea JTHTML;
    private javax.swing.JTextArea JTIMG;
    private javax.swing.JTextArea JT_Descripcion;
    private javax.swing.JTextField JT_Gama;
    private javax.swing.JToggleButton btn_Cerrar_Gama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
