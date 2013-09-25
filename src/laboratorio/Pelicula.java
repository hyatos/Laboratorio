
package laboratorio;


public class Pelicula implements Comparable {
    
    private String titulo;
    private String genero;
    private String codigo;
    private String formato;
    private String autor;
    private int ejemplares;
    
Pelicula(String t, String ge, String co, String fo, String au, int eje)
{
this.titulo = t;
this.genero = ge;
this.codigo = co;
this.formato = fo;
this.autor = au;
this.ejemplares = eje;
}    

    @Override
    public String toString()
    {
    return titulo;
    }
    
    @Override
    public int compareTo(Object o) {
        Pelicula peli = (Pelicula) o;
        return (this.titulo.compareToIgnoreCase(peli.titulo));
    }



}
