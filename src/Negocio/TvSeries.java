
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class TvSeries extends Interes implements IGustosTiempo{
    
    private String genero;

    public TvSeries() {
    }

    public TvSeries(String genero) {
        this.genero = genero;
    }

    public TvSeries(String genero, int tiempoConectado, int like) {
        super(tiempoConectado, like);
        this.genero = genero;
    }

    public TvSeries(String genero, String usuario, String contraseña, int tiempoConectado, int like) {
        super(usuario, contraseña, tiempoConectado, like);
        this.genero = genero;
    }

    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+ " TvSeries{" + "genero=" + genero + '}';
    }
    
    @Override
    public void visualizar() {
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Género: " + this.getGenero());
        
    }

    @Override
    public void revisar(int likes) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
    }
    
    
    
}