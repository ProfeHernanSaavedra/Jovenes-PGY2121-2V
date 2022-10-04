package Presentacion;

import Datos.Coleccion;
import Negocio.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USRVI-LC2
 */
public class TestJovenes {
    public static void main(String[] args) {
        
        String genero = JOptionPane.showInputDialog(null, "Ingrese Genero", "Nuevo", 1);
        String tConectado = JOptionPane.showInputDialog(null, "Ingrese Tiempo Conectado", "Nuevo", 1);
        int tiempoCon = Integer.parseInt(tConectado);
        String likesStr = JOptionPane.showInputDialog(null, "Ingrese Likes", "Nuevo", 1);
        int likesInt = Integer.parseInt(likesStr);
        
        Interes musica = new Musica(genero, tiempoCon,likesInt);
        musica.setUsuario("juanito");
        musica.setContraseña("1232");
        
        RedesSociales rs = new RedesSociales("Instagram",240, 25);
        TvSeries tv = new TvSeries("Terror", 260, 3);
        
        Coleccion col = new Coleccion();
        
        col.agregar(musica);
        col.agregar(rs);
        col.agregar(tv);
        
        col.mostraLista();
        
        col.masLikes();
        col.masTimepoConectado();
        
        
        
        
        
        
    }
            
    
}

