
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Musica extends Interes implements IGustosTiempo{
    
    private String tipoMusica;

    public Musica() {
    }

    public Musica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public Musica(String tipoMusica, String usuario, String contraseña, int tiempoConectado) {
        super(usuario, contraseña, tiempoConectado);
        this.tipoMusica = tipoMusica;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return super.toString()+" Musica{" + "tipoMusica=" + tipoMusica + '}';
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Tipo Musica: " + this.getTipoMusica());
        
    }

    @Override
    public void revisar(int likes) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
    }

    
    
  
    
    
    
}
