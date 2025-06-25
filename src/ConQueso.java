package patronesdediseño;

/**
 * Decorador concreto - Agregar queso al plato
 */
public class ConQueso extends DecoradorPlato {
    
    public ConQueso(Plato plato) {
        super(plato);
    }
    
    @Override
    public String getDescripcion() {
        return plato.getDescripcion() + " + Queso";
    }
    
    @Override
    public double getPrecio() {
        return plato.getPrecio() + 2.50;
    }
}