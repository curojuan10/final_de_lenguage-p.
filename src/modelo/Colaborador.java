package modelo;

/**
 *
 * @author HP
 */
public class Colaborador {
    //Atrinutos o variables

    private int id_colaborador;
    private String nombre;
    private String apellido;
    private double nota;
    private String descripcion;
    private int id_categoria;
    private int id_nota;
    private int id_usuario;

    //constructor
    public Colaborador() {
        this.id_categoria = 0;
        this.nombre = "";
        this.apellido = "";
        this.nota = 0.0;
        this.descripcion = "";
        this.id_categoria = 0;
        this.id_nota = 0;
        this.id_usuario = 0;
    }
    //constructor cargada
    public Colaborador(int id_colaborador, String nombre, String apellido, double nota, String descripcion, int id_categoria, int id_nota, int id_usuario) {
        this.id_colaborador = id_colaborador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
        this.id_nota = id_nota;
        this.id_usuario = id_usuario;
    }

    public int getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(int id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

}
