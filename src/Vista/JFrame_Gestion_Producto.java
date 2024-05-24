package Vista;

import javax.swing.JOptionPane;
import modelos.Producto;
import modelos.ProductoDAO;

public class JFrame_Gestion_Producto extends javax.swing.JFrame implements Interfaz {

    JFrame_Buscar_Producto buscar_Producto;
    ProductoDAO productoDAO;
    boolean confirmar = false;
    JFrame_Buscar_Producto buscarProducto;

    public JFrame_Gestion_Producto() {
        productoDAO = new ProductoDAO();
        buscar_Producto = new JFrame_Buscar_Producto();
        initComponents();
        setDefaultCloseOperation(JFrame_Buscar_Producto.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_Cerrar_Gama = new javax.swing.JToggleButton();
        btnConfirmar = new javax.swing.JToggleButton();
        txtNombre = new javax.swing.JTextField();
        txtCodigoProducto = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtCantidadStock = new javax.swing.JTextField();
        txtDimensiones = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtPrecioProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cbxGama = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Gama:");

        jLabel4.setText("Dimensiones:");

        jLabel5.setText("Proveedor:");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setText("Descripción:");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setText("Cantidad en stock:");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setText("Precio de Venta:");

        jLabel9.setText("Precio de Proveedor:");

        btn_Cerrar_Gama.setText("Cerrar");
        btn_Cerrar_Gama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cerrar_GamaActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        txtCodigoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescripcion);

        cbxGama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Aromáticas", "Frutales", "Herbaceas", "Herramientas", "Ornamentales" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btn_Cerrar_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtProveedor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(txtCodigoProducto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxGama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDimensiones, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtCantidadStock)
                    .addComponent(txtPrecioVenta)
                    .addComponent(txtPrecioProveedor))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(cbxGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(42, 42, 42)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtDimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtCantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtPrecioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cerrar_Gama, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cerrar_GamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cerrar_GamaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_Cerrar_GamaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (confirmar == true) {
            actualizar();
        } else {
            agregar();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConfirmar;
    private javax.swing.JToggleButton btn_Cerrar_Gama;
    private javax.swing.JComboBox<String> cbxGama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidadStock;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDimensiones;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioProveedor;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables

    private Producto producto;
    private JFrame_Buscar_Producto tablaProducto;

    public void enviarproducto(Producto producto, int tipo) {
        this.producto = producto;
        confirmar = true;

        if (tipo == 1) {
            Muestra();
        } else {
            mostrarDatos();
        }
    }

    private void agregar() {
        // Verificar que los campos obligatorios no estén vacíos y los campos numéricos sean válidos
        if (camposObligatoriosLlenos() && camposNumericosValidos()) {
            // Crear el objeto Producto si los campos son válidos
            Producto producto = new Producto(
                    txtCodigoProducto.getText(),
                    txtNombre.getText(),
                    cbxGama.getSelectedItem().toString(),
                    txtDimensiones.getText().isEmpty() ? null : txtDimensiones.getText(),
                    txtProveedor.getText().isEmpty() ? null : txtProveedor.getText(),
                    txtDescripcion.getText().isEmpty() ? null : txtDescripcion.getText(),
                    Integer.parseInt(txtCantidadStock.getText()),
                    Float.parseFloat(txtPrecioVenta.getText()),
                    Float.parseFloat(txtPrecioProveedor.getText())
            );

            // Agregar el producto a la base de datos
            productoDAO.agregar(producto);
            productos.add(producto);
            

            // Limpiar los campos después de agregar el producto
            this.dispose();

            // Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
        }
    }

    private boolean camposObligatoriosLlenos() {
        // Verifica si la selección del ComboBox es válida
        if (cbxGama.getSelectedItem() == null || cbxGama.getSelectedItem().toString().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Selecciona una gama válida.");
            return false;
        }

        // Verifica si algún campo obligatorio está vacío
        if (txtCodigoProducto.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCantidadStock.getText().isEmpty()
                || txtPrecioVenta.getText().isEmpty() || txtPrecioProveedor.getText().isEmpty()
                || txtDimensiones.getText().isEmpty() || txtProveedor.getText().isEmpty() || txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce todos los datos obligatorios.");
            return false;
        }

        return true;
    }

    private boolean camposNumericosValidos() {
        try {
            Integer.parseInt(txtCantidadStock.getText());
            Float.parseFloat(txtPrecioVenta.getText());
            Float.parseFloat(txtPrecioProveedor.getText());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los campos de cantidad, precio de venta y precio de proveedor deben ser numéricos.");
            return false;
        }
    }

    private void mostrarDatos() {
        // El primer campo no debe ser editable
        txtCodigoProducto.setText(producto.getCodigo_producto());
        txtCodigoProducto.setEditable(false);

        // Los demás campos deben ser editables
        txtNombre.setText(producto.getNombre());
        txtNombre.setEditable(true);

        cbxGama.setSelectedItem(producto.getGama());
        cbxGama.setEnabled(true);

        txtDimensiones.setText(producto.getDimensiones());
        txtDimensiones.setEditable(true);

        txtProveedor.setText(producto.getProveedor());
        txtProveedor.setEditable(true);

        txtDescripcion.setText(producto.getDescripcion());
        txtDescripcion.setEditable(true);

        txtCantidadStock.setText(String.valueOf(producto.getCantidad_en_stock()));
        txtCantidadStock.setEditable(false);

        txtPrecioVenta.setText(String.valueOf(producto.getPrecio_venta()));
        txtPrecioVenta.setEditable(true);

        txtPrecioProveedor.setText(String.valueOf(producto.getPrecio_proveedor()));
        txtPrecioProveedor.setEditable(true);

        btnConfirmar.setVisible(true);

    }

        private void actualizar() {
        try {
            Object[] ob = new Object[8];
            ob[0] = txtCodigoProducto.getText();
            ob[1] = txtNombre.getText();
            ob[2] = (String) cbxGama.getSelectedItem();
            ob[3] = txtDimensiones.getText();
            ob[4] = txtProveedor.getText();
            ob[5] = txtDescripcion.getText();
            ob[6] = Float.parseFloat(txtPrecioVenta.getText());
            ob[7] = Float.parseFloat(txtPrecioProveedor.getText());

            productoDAO.actualizar(ob);
            buscar_Producto.limpiarTabla();

            // Actualizar los valores del objeto producto asegurando la conversión adecuada
            producto.setCodigo_producto((String) ob[0]);
            producto.setNombre((String) ob[1]);
            producto.setGama((String) ob[2]);
            producto.setDimensiones((String) ob[3]);
            producto.setProveedor((String) ob[4]);
            producto.setDescripcion((String) ob[5]);
            producto.setPrecio_venta((Float) ob[6]);
            producto.setPrecio_proveedor((Float) ob[7]);
        } catch (NumberFormatException e) {
            // Manejar excepción si txtPrecioVenta o txtPrecioProveedor no se pueden convertir a float
            JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos en los campos de precio.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Manejar cualquier otra excepción que pueda ocurrir
            JOptionPane.showMessageDialog(null, "Ocurrió un error al actualizar el producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Muestra() {

        txtCodigoProducto.setText(producto.getCodigo_producto());
        txtCodigoProducto.setEditable(false);

        txtNombre.setText(producto.getNombre());
        txtNombre.setEditable(false);

        cbxGama.setSelectedItem(producto.getGama());
        cbxGama.setEnabled(false);

        txtDimensiones.setText(producto.getDimensiones());
        txtDimensiones.setEditable(false);

        txtProveedor.setText(producto.getProveedor());
        txtProveedor.setEditable(false);

        txtDescripcion.setText(producto.getDescripcion());
        txtDescripcion.setEditable(false);

        txtCantidadStock.setText(String.valueOf(producto.getCantidad_en_stock()));
        txtCantidadStock.setEditable(false);

        txtPrecioVenta.setText(String.valueOf(producto.getPrecio_venta()));
        txtPrecioVenta.setEditable(false);

        txtPrecioProveedor.setText(String.valueOf(producto.getPrecio_proveedor()));
        txtPrecioProveedor.setEditable(false);
        btnConfirmar.setVisible(false);
    }

}
