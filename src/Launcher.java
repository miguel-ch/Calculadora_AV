import presentacion.Modelo;

/**
 *
 * @author Miguel
 */
public class Launcher {

    private Modelo app;
    
    public Launcher(){
        app = new Modelo();
        app.iniciar();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Launcher();
    }
}
