package modelo;

/**
 *
 * @author HP
 */
public class Categoria {

    private int id_categoria;
    private String descripcion;
    private String Estado;

    public Categoria() {
        this.id_categoria = 0;
        this.descripcion = "";
        this.Estado = "";
    }

    public Categoria(int id_categoria, String descripcion, String Estado) {
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.Estado = Estado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
