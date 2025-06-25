package patronesdediseño;

/**
 * Patrón Singleton - Gestor único del restaurante
 * Garantiza que solo exista una instancia del gestor principal
 */
public class RestauranteManager {
    private static RestauranteManager instancia;
    private String nombreRestaurante;
    private int mesasDisponibles;
    
    // Constructor privado para evitar instanciación externa
    private RestauranteManager() {
        this.nombreRestaurante = "El Buen Sabor";
        this.mesasDisponibles = 10;
    }
    
    // Método para obtener la única instancia
    public static RestauranteManager getInstancia() {
        if (instancia == null) {
            instancia = new RestauranteManager();
        }
        return instancia;
    }
    
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }
    
    public int getMesasDisponibles() {
        return mesasDisponibles;
    }
    
    public void reservarMesa() {
        if (mesasDisponibles > 0) {
            mesasDisponibles--;
            System.out.println("Mesa reservada. Mesas disponibles: " + mesasDisponibles);
        } else {
            System.out.println("No hay mesas disponibles");
        }
    }
    
    public void liberarMesa() {
        mesasDisponibles++;
        System.out.println("Mesa liberada. Mesas disponibles: " + mesasDisponibles);
    }
}