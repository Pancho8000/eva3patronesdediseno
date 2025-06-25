package patronesdediseño;

/**
 * Decorador concreto - Agregar salsa al plato
 */
public class ConSalsa extends DecoradorPlato {
    
    public ConSalsa(Plato plato) {
        super(plato);
    }
    
    @Override
    public String getDescripcion() {
        return plato.getDescripcion() + " + Salsa especial";
    }
    
    @Override
    public double getPrecio() {
        return plato.getPrecio() + 1.75;
    }
}