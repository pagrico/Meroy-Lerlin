package Vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;
import modelos.ProductoDAO;

public class JFrame_Buscar_Producto extends javax.swing.JFrame implements Interfaz {

    ProductoDAO productoDAO;
    DefaultTableModel modelo;
    JFrame_Gestion_Producto gestionProducto;

    public JFrame_Buscar_Producto() {
        productoDAO = new ProductoDAO();
        modelo = new DefaultTableModel();
        initComponents();
        setDefaultCloseOperation(JFrame_Buscar_Producto.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        tablaProductos.setModel(modelo);
        mostrarTablaCompleta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_busc_Prod = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnAniadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cbxSeleccion = new javax.swing.JComboBox<>();
        txtParametro = new javax.swing.JTextField();
        Btn_stock = new javax.swing.JButton();

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

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaProductos);

        btnAniadir.setText("Añadir");
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 1, 24))); // NOI18N

        cbxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoge uno...", "ID", "Nombre", "Gama", "Proveedor" }));
        cbxSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionActionPerformed(evt);
            }
        });

        txtParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParametroKeyTyped(evt);
            }
        });

        Btn_stock.setText("Cambiar Stock");
        Btn_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_stockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtParametro, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(cbxSeleccion, 0, 172, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSeleccion))
                .addGap(33, 33, 33)
                .addComponent(Btn_stock)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        agregar();
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Muestra();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtParametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametroKeyTyped
        mostrar();
    }//GEN-LAST:event_txtParametroKeyTyped

    private void cbxSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSeleccionActionPerformed

    private void Btn_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_stockActionPerformed
        Cambiar_Stock();
    }//GEN-LAST:event_Btn_stockActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_stock;
    private javax.swing.ButtonGroup Grupo_busc_Prod;
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cbxSeleccion;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtParametro;
    // End of variables declaration//GEN-END:variables
   private void Cambiar_Stock() {
    int filaSeleccionada = tablaProductos.getSelectedRow();

    if (filaSeleccionada != -1) {
        String parametro = tablaProductos.getValueAt(filaSeleccionada, 0).toString();
        Producto aux = null;

        for (Producto producto : productos) {
            if (producto.getCodigo_producto().equals(parametro)) {
                aux = producto;
                break; // Salir del bucle una vez encontrado el producto
            }
        }

        if (aux != null) {
            try {
                int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la nueva cantidad de stock para el producto: " + aux.getCodigo_producto()+"\nCantidad actual: " +aux.getCantidad_en_stock(),"Cambio de Stock",JOptionPane.WARNING_MESSAGE));
                
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cambiar el stock del producto: " + aux.getCodigo_producto() + " a " + nuevoStock + "?", "Confirmar Cambio de Stock", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Actualizar el stock usando el método correspondiente
                    productoDAO.actualizarStock(aux.getCodigo_producto(), nuevoStock);
                    aux.setcantidad_stock(nuevoStock);
                    
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Cantidad de stock no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila de la tabla.");
    }
}



    private void mostrar() {
        modelo.setRowCount(0); // Limpiar la tabla
        String parametro = txtParametro.getText().trim(); // Obtener el texto del campo de parámetro
        String itemSeleccionado = (String) cbxSeleccion.getSelectedItem(); // Obtener el item seleccionado del combobox

        // Verificar si el parámetro está vacío
        if (parametro.isEmpty()) {
            mostrarTablaCompleta(); // Llamar a la función que muestra todos los datos
            return;
        }

        // Solo proceder si hay un item seleccionado y el parámetro no está vacío
        if (itemSeleccionado != null) {
            List<Producto> productosFiltrados = new ArrayList<>();

            // Filtrar productos en base a la selección del combobox
            for (Producto producto : productos) { // Asumiendo que tienes una lista llamada listaProductos
                boolean coincide = false;

                switch (itemSeleccionado) {
                    case "ID":
                        coincide = producto.getCodigo_producto().toLowerCase().contains(parametro.toLowerCase());
                        break;
                    case "Nombre":
                        coincide = producto.getNombre().toLowerCase().contains(parametro.toLowerCase());
                        break;
                    case "Gama":
                        coincide = producto.getGama().toLowerCase().contains(parametro.toLowerCase());
                        break;
                    case "Proveedor":
                        coincide = producto.getProveedor().toLowerCase().contains(parametro.toLowerCase());
                        break;
                    // Agrega más casos según sea necesario
                    default:
                        JOptionPane.showMessageDialog(null, "Selección no válida.");
                        return;
                }

                if (coincide) {
                    productosFiltrados.add(producto);
                }
            }

            // Filtra los productos que no están en el historial
            if (!productosFiltrados.isEmpty()) {
                boolean hayProductosNoHistorial = false;

                for (Producto producto : productosFiltrados) {
                    String codigoProducto = producto.getCodigo_producto();
                    if (!codigosHistorial.contains(codigoProducto)) {
                        Object[] ob = {codigoProducto, producto.getNombre(), producto.getGama(), producto.getProveedor()};
                        modelo.addRow(ob);
                        hayProductosNoHistorial = true;
                    }
                }

                // Muestra un mensaje si no hay productos que mostrar
                if (!hayProductosNoHistorial) {
                    JOptionPane.showMessageDialog(null, "No hay ningún producto con ese parámetro.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún producto con ese parámetro.");
            }
        } // No mostrar el mensaje de error si el parámetro está vacío durante la escritura
        else if (itemSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un elemento de la lista.");
        }
    }

    public void mostrarTablaCompleta() {
        for (Producto producto : productos) {
            Object[] ob = {
                producto.getCodigo_producto(),
                producto.getNombre(),
                producto.getGama(),
                producto.getProveedor()
            };
            modelo.addRow(ob);
        }
    }

    private void eliminar() {
    int filaSeleccionada = tablaProductos.getSelectedRow();

    if (filaSeleccionada != -1) {
        String celda = tablaProductos.getValueAt(filaSeleccionada, 0).toString();
        
        // Eliminar el producto de la base de datos
        productoDAO.eliminar(celda);
        
        // Eliminar el producto del ArrayList productos usando un Iterator
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo_producto().equals(celda)) {
                iterator.remove();
                break;
            }
        }

        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila de la tabla.");
    }
}


    private void modificar() {
        gestionProducto = new JFrame_Gestion_Producto();

        int filaSeleccionada = tablaProductos.getSelectedRow();

        if (filaSeleccionada != -1) {
            String parametro = tablaProductos.getValueAt(filaSeleccionada, 0).toString();
            Producto aux = null;

            for (Producto producto : productos) {
                if (producto.getCodigo_producto().equals(parametro)) {
                    aux = producto;
                    break; // Salir del bucle una vez encontrado el producto
                }
            }

            if (aux != null) {
                gestionProducto.setVisible(true);
                gestionProducto.enviarproducto(aux, 0);
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila de la tabla.");
        }
    }

    private void Muestra() {
        gestionProducto = new JFrame_Gestion_Producto();

        int filaSeleccionada = tablaProductos.getSelectedRow();

        if (filaSeleccionada != -1) {
            String parametro = tablaProductos.getValueAt(filaSeleccionada, 0).toString();
            Producto aux = null;

            for (Producto producto : productos) {
                if (producto.getCodigo_producto().equals(parametro)) {
                    aux = producto;
                    break; // Salir del bucle una vez encontrado el producto
                }
            }

            if (aux != null) {
                gestionProducto.setVisible(true);
                gestionProducto.enviarproducto(aux, 1);
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila de la tabla.");
        }
    }

    public void limpiarTabla() {
        modelo.setRowCount(0);
    }

    private void agregar() {
        gestionProducto = new JFrame_Gestion_Producto();
        gestionProducto.setVisible(true);
    }
    
}
