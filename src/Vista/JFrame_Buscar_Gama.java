/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.util.Iterator;
import javax.swing.JOptionPane;

import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import modelos.GamaProducto;
import modelos.GamaProductoDAO;

/**
 *
 * @author Pablo
 */
public class JFrame_Buscar_Gama extends javax.swing.JFrame implements Interfaz {

    int Seleccion;
    GamaProductoDAO dao;

    DefaultTableModel modelo;

    /**
     * Creates new form JFrame_Buscar_Producto
     */
    public JFrame_Buscar_Gama() {
        initComponents();
        setDefaultCloseOperation(JFrame_Buscar_Gama.DISPOSE_ON_CLOSE);
        modelo = new DefaultTableModel();
        modelo.addColumn("Gama");
        modelo.addColumn("Descripción");
        Tabla_inicio();
        Tabla_Gama.setModel(modelo);

    }

    public void Tabla_inicio() {
        String[] datos = new String[2];
        for (GamaProducto gama : Array_Gama_Productos) {
            datos[0] = gama.getGama();
            datos[1] = gama.getDescripcion_texto();

            modelo.addRow(datos);

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

        Grupo_busc_Prod = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Gama = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        Texto_Filtrado_Gama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Anadir_Gama = new javax.swing.JButton();
        Eliminar_gama = new javax.swing.JButton();
        Modificar_gama = new javax.swing.JButton();
        Mostrar_gama = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla_Gama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Tabla_Gama);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "GAMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 1, 24))); // NOI18N

        Texto_Filtrado_Gama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Texto_Filtrado_GamaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Gama:");

        Anadir_Gama.setText("Añadir");
        Anadir_Gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anadir_GamaActionPerformed(evt);
            }
        });

        Eliminar_gama.setText("Eliminar");
        Eliminar_gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_gamaActionPerformed(evt);
            }
        });

        Modificar_gama.setText("Modificar");
        Modificar_gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_gamaActionPerformed(evt);
            }
        });

        Mostrar_gama.setText("Mostrar");
        Mostrar_gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_gamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Texto_Filtrado_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Eliminar_gama, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anadir_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Modificar_gama, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(Mostrar_gama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Filtrado_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anadir_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar_gama, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mostrar_gama, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar_gama, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mostrar_gamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_gamaActionPerformed
        Abrir(3); // TODO add your handling code here:
    }//GEN-LAST:event_Mostrar_gamaActionPerformed

    private void Anadir_GamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anadir_GamaActionPerformed
        Abrir(1);
        LimpiarTabla();
        Tabla_inicio();
        Texto_Filtrado_Gama.setText("");


    }//GEN-LAST:event_Anadir_GamaActionPerformed

    private void Modificar_gamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_gamaActionPerformed
        Abrir(2);

    }//GEN-LAST:event_Modificar_gamaActionPerformed


    private void Texto_Filtrado_GamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_Filtrado_GamaKeyTyped
        LimpiarTabla();
        filtrar();
    }//GEN-LAST:event_Texto_Filtrado_GamaKeyTyped

    private void Eliminar_gamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_gamaActionPerformed

        // Verificar si hay algún elemento seleccionado en la tabla
        int selectedRow = Tabla_Gama.getSelectedRow();
        if (selectedRow == -1) {
            // Mostrar mensaje de error si no hay ninguna fila seleccionada
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si no hay selección
        }

        // Si hay un elemento seleccionado, proceder con la eliminación
        GamaProducto gama = Objeto();
        Iterator<GamaProducto> iterador = Array_Gama_Productos.iterator();

        // Iterar sobre la lista de productos
        while (iterador.hasNext()) {
            GamaProducto productoActual = iterador.next(); // Obtener el objeto actual del iterador
            if (gama.equals(productoActual)) { // Comparar el objeto gama con el objeto actual
                iterador.remove(); // Eliminar el objeto actual del iterador
                Gama_DAO.eliminar(productoActual.getGama()); // Eliminar el objeto actual de la base de datos
            }
        }
        LimpiarTabla();
        Tabla_inicio();
    }//GEN-LAST:event_Eliminar_gamaActionPerformed

    public void Abrir(int seleccionado) {
        GamaProducto gamaProducto = null;

        // Obtener el objeto GamaProducto solo en los casos 2 y 3
        if (seleccionado == 2 || seleccionado == 3) {
            gamaProducto = Objeto();
            if (gamaProducto == null) {
                JOptionPane.showMessageDialog(this, "Debes seleccionar un dato válido");
                return; // Salir del método si el objeto es nulo
            }
        }

        // Crear el JFrame_Gestion_Gama con el parámetro adicional
        JFrame_Gestion_Gama Gestion_Gama = new JFrame_Gestion_Gama(seleccionado, gamaProducto);

        Gestion_Gama.setVisible(true);
        JToggleButton boton = Gestion_Gama.getBtn_Gestion_Gama();

        switch (seleccionado) {
            case 1:
                boton.setText("Añadir");
                break;
            case 2:
                Gama_DAO.set_Gama(gamaProducto);
                boton.setText("Actualizar");
                break;
            case 3:
                Gama_DAO.set_Gama(gamaProducto);
                boton.setText("Generar Actuación");
                break;
        }
    }

    public GamaProducto Objeto() {
        try {
            int filaSeleccionada = Tabla_Gama.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Debes seleccionar una fila.");
                return null;
            }

            String gamaSeleccionada = ((String) Tabla_Gama.getValueAt(filaSeleccionada, 0)).trim();
            return buscarGamaProductoPorGama(gamaSeleccionada);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila válida.");
            return null;
        }
    }

    private GamaProducto buscarGamaProductoPorGama(String gamaSeleccionada) {
        for (GamaProducto gamaProducto : Array_Gama_Productos) {
            if (gamaProducto.getGama().trim().equals(gamaSeleccionada)) {
                return gamaProducto;
            }
        }
        JOptionPane.showMessageDialog(this, "No se encontró ningún objeto con la gama seleccionada.");
        return null;
    }

    public void LimpiarTabla() {
        modelo.setRowCount(0);
    }

    public void filtrar() {
        String texto = Texto_Filtrado_Gama.getText().toLowerCase(); // Convertir a minúsculas
        if (texto != null && !texto.isEmpty()) {
            DefaultTableModel modelo = (DefaultTableModel) Tabla_Gama.getModel();
            modelo.setRowCount(0); // Limpiar la tabla antes de agregar datos

            for (GamaProducto gama : Array_Gama_Productos) {
                if (gama.getGama().toLowerCase().startsWith(texto)) { // Convertir a minúsculas
                    Object[] fila = {gama.getGama(), gama.getDescripcion_texto()};
                    modelo.addRow(fila);
                }
            }
        } else {
            Tabla_inicio(); // Llamar a la función Tabla_inicio cuando no hay nada en el campo de búsqueda
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anadir_Gama;
    private javax.swing.JButton Eliminar_gama;
    private javax.swing.ButtonGroup Grupo_busc_Prod;
    private javax.swing.JButton Modificar_gama;
    private javax.swing.JButton Mostrar_gama;
    public javax.swing.JTable Tabla_Gama;
    private javax.swing.JTextField Texto_Filtrado_Gama;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
