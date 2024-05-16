
package modelos;

public class GamaProducto {

    private String gama;
    private String descripcion_texto;
    private String descripcion_html;
    private String imagen;

    public GamaProducto(String gama, String descripcion_texto, String descripcion_html, String imagen) {
        this.gama = gama;
        this.descripcion_texto = descripcion_texto;
        this.descripcion_html = descripcion_html;
        this.imagen = imagen;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getDescripcion_texto() {
        return descripcion_texto;
    }

    public void setDescripcion_texto(String descripcion_texto) {
        this.descripcion_texto = descripcion_texto;
    }

    public String getDescripcion_html() {
        return descripcion_html;
    }

    public void setDescripcion_html(String descripcion_html) {
        this.descripcion_html = descripcion_html;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
