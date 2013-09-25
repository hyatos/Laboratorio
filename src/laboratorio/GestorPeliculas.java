
package laboratorio;

import java.util.*;


public class GestorPeliculas {
    
    TreeSet gestor; 
    
GestorPeliculas()
{
gestor = new TreeSet();
}

public void agregarPelicula(Pelicula pelicula)
{
gestor.add(pelicula);
}
    
public void ordenarPeliculas()
{
    List ordenar = new ArrayList();
    ordenar.addAll(gestor);
    Collections.sort(ordenar);
    
    Iterator <Pelicula> it = ordenar.iterator();
    
        while(it.hasNext())
        {
        Pelicula peli = it.next();
        System.out.println(peli.toString());
        }
}




}
