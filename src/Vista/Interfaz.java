/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import java.util.List;
import modelos.GamaProducto;
import modelos.GamaProductoDAO;
import modelos.Producto;
import modelos.ProductoDAO;
/**
 *
 * @author Pablo
 */
public interface Interfaz {

    GamaProductoDAO Gama_DAO = new GamaProductoDAO();
    ProductoDAO productoDAO = new ProductoDAO();
    ArrayList<GamaProducto> Array_Gama_Productos = (ArrayList<GamaProducto>) Gama_DAO.listar();
    List<Producto> productos = productoDAO.listar();
    List<String> codigosHistorial = productoDAO.buscarHistorial();

}
