package patronesdediseño;

/**
 * Cocina que notifica cuando los pedidos están listos
 */
public class Cocina extends Observable {
    private String nombre;
    
    public Cocina(String nombre) {
        this.nombre = nombre;
    }
    
    public void prepararPedido(String pedido) {
        System.out.println("[" + nombre + "] Preparando: " + pedido);
        // Simular tiempo de preparación
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String mensaje = "Pedido listo: " + pedido;
        System.out.println("[" + nombre + "] " + mensaje);
        notificarObservadores(mensaje);
    }
}