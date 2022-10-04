package Datos;

import Negocio.Interes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USRVI-LC2
 */
public class Coleccion {
    
    private ArrayList<Interes> listaIntereses;

    public Coleccion() {
        
        listaIntereses = new ArrayList<>();
        
    }
    
    public void agregar(Interes interes)
    {
        listaIntereses.add(interes);
    }
    
    public void mostraLista()
    {
        for (Interes interes : listaIntereses) {
            System.out.println(interes);
        }
    }
    
    public void masLikes()
    {
        int mayor = 0;
        String clase = "";
        for (Interes interes : listaIntereses) {
            if (interes.getLike() > mayor) {
                mayor = interes.getLike();
                //clase = interes.getClass().getName();
                clase = interes.getClass().getSimpleName();
            }
            
        }
        System.out.println("La clase que tiene mas likes es: " + clase);
    }
    
    public void masTimepoConectado()
    {
        int mayor = 0;
        String clase = "";
        for (Interes interes : listaIntereses) {
            if (interes.getTiempoConectado() > mayor) {
                mayor = interes.getTiempoConectado();
                //clase = interes.getClass().getName();
                clase = interes.getClass().getSimpleName();
            }
            
        }
        JOptionPane.showMessageDialog(null, "La clase que tiene mas tiempo Conectado es: " + clase, "Tiempo Conectado", 1);
        
        System.out.println("La clase que tiene mas tiempo Conectado es: " + clase);
    }
    
    
    
}

