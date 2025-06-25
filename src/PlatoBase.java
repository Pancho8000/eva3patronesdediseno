package patronesdediseño;

/**
 * Implementación base de un plato
 */
public class PlatoBase implements Plato {
    private String nombre;
    private double precio;
    
    public PlatoBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public String getDescripcion() {
        return nombre;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }
}