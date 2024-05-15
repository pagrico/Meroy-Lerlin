/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_programacion;

/**
 *
 * @author Pablo
 */
public class Producto {
    
    protected String ID_Prod;
    protected String Nom_Prod;
    protected Gama Gama_Prod;
    protected String Dim_Prod;
    protected String Prov_Prod;
    protected String Desc_Prod;
    protected int Cant_Prod;
    protected Float Prec_Prod;
    protected Float Prec_Prov;

    public Producto(String ID_Prod, String Nom_Prod, Gama Gama_Prod, int Cant_Prod, Float Prec_Prod) {
        this.ID_Prod = ID_Prod;
        this.Nom_Prod = Nom_Prod;
        this.Gama_Prod = Gama_Prod;
        this.Cant_Prod = Cant_Prod;
        this.Prec_Prod = Prec_Prod;
    }
    
    
            
    

    
}
