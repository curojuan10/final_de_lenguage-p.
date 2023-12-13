package modelo;

public class Nota {

    private int id_nota;
    private String titulo;
    private String contenido;
    private String fechaCreacion;
    private String fechaModificacion;
    private String prioridad;

    public Nota() {
        this.id_nota = 0;
        this.titulo = "";
        this.contenido = "";
        this.fechaCreacion = "";
        this.fechaModificacion = "";
        this.prioridad = "";
    }

    public Nota(int id_nota, String titulo, String contenido, String fechaCreacion, String fechaModificacion, String prioridad) {
        this.id_nota = id_nota;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.prioridad = prioridad;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

}
