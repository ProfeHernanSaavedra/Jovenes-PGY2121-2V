
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class RedesSociales extends Interes implements IGustosTiempo{
    
    private String nombre;

    public RedesSociales() {
    }

    public RedesSociales(String nombre) {
        this.nombre = nombre;
    }

    public RedesSociales(String nombre, String usuario, String contraseña, int tiempoConectado, int like) {
        super(usuario, contraseña, tiempoConectado, like);
        this.nombre = nombre;
    }

    public RedesSociales(String nombre, int tiempoConectado, int like) {
        super(tiempoConectado, like);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+ " RedesSociales{" + "nombre=" + nombre + '}';
    }
    
     @Override
    public void visualizar() {
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Nombre Red Social:  " + this.getNombre());
        
    }

    @Override
    public void revisar(int likes) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
    }

    
    
    
}
