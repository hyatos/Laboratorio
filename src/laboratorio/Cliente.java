
package laboratorio;

public class Cliente extends Persona{
    
    private String numeroCliente;
    
Cliente(String n, String ap, String d, String tel, String dom, String numCli)
{
super(n,ap,d,tel, dom);
this.numeroCliente = numCli;
}

    /**
     * @return the numeroCliente
     */
    public String getNumeroCliente() {
        return numeroCliente;
    }

    /**
     * @param numeroCliente the numeroCliente to set
     */
    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }



}
