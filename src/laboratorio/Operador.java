
package laboratorio;


public class Operador extends Persona{
    
    private String usuario;
    private String contraseña;
    
Operador(String n, String ap, String d, String tel, String dom, String usu, String cont)
{
    super(n,ap,d,tel,dom);
    this.usuario = usu;
    this.contraseña = cont;
}    

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



}
