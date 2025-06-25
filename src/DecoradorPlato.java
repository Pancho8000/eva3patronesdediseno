package patronesdediseño;

/**
 * Decorador base para agregar funcionalidades a los platos
 */
public abstract class DecoradorPlato implements Plato {
    protected Plato plato;
    
    public DecoradorPlato(Plato plato) {
        this.plato = plato;
    }
    
    @Override
    public String getDescripcion() {
        return plato.getDescripcion();
    }
    
    @Override
    public double getPrecio() {
        return plato.getPrecio();
    }
}