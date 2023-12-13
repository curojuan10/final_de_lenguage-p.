package modelo;

/**
 *
 * @author HP
 */
public class Usuario {

    //atributos
    private int id_usuario;
    private String usuario;
    private String password;
    private String correoElectronico;
    private String otrosDatosUsuario;
    //constructor
    public Usuario() {
        this.id_usuario = 0;
        this.usuario = "";
        this.password = "";
        this.correoElectronico = "";
        this.otrosDatosUsuario = "";
      
    }
    //creamos set and get 

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getOtrosDatosUsuario() {
        return otrosDatosUsuario;
    }

    public void setOtrosDatosUsuario(String otrosDatosUsuario) {
        this.otrosDatosUsuario = otrosDatosUsuario;
    }
    
}
