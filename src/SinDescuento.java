package patronesdediseño;

/**
 * Estrategia concreta - Sin descuento
 */
public class SinDescuento implements EstrategiaDescuento {
    
    @Override
    public double aplicarDescuento(double precio) {
        return precio;
    }
    
    @Override
    public String getDescripcion() {
        return "Sin descuento";
    }
}