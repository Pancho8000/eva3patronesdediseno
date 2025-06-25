package patronesdediseño;

/**
 * Mesero que recibe notificaciones de la cocina
 */
public class Mesero implements Observer {
    private String nombre;
    
    public Mesero(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Mesero " + nombre + "] Recibido: " + mensaje + " - Llevando al cliente");
    }
}