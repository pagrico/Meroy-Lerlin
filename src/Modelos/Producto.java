
package modelos;

public class Producto {
    
    private String codigo_producto;
    private String nombre;
    private String gama;
    private String dimensiones;
    private String proveedor;
    private String descripcion;
    private int cantidad_en_stock;
    private float precio_venta;
    private float precio_proveedor;

    public Producto(String codigo_producto, String nombre, String gama, String dimensiones, String proveedor, String descripcion, 
            int cantidad_en_stock, float precio_venta, float precio_proveedor) {

        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.gama = gama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidad_en_stock = cantidad_en_stock;
        this.precio_venta = precio_venta;
        this.precio_proveedor = precio_proveedor;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad_en_stock() {
        return cantidad_en_stock;
    }

    public void setCantidad_en_stock(int cantidad_en_stock) {
        this.cantidad_en_stock = cantidad_en_stock;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public float getPrecio_proveedor() {
        return precio_proveedor;
    }

    public void setPrecio_proveedor(float precio_proveedor) {
        this.precio_proveedor = precio_proveedor;
    }
    public void setcantidad_stock(int cantidad_stock){
        this.cantidad_en_stock=cantidad_stock;
    }
}
