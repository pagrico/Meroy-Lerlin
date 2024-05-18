/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import modelos.GamaProducto;
import modelos.GamaProductoDAO;

/**
 *
 * @author Pablo
 */
public interface Interfaz {

    GamaProductoDAO Gama_DAO = new GamaProductoDAO();
    ArrayList<GamaProducto> Array_Gama_Productos = (ArrayList<GamaProducto>) Gama_DAO.listar();

}
