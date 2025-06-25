package patronesdediseño;

/**
 * Contexto para el patrón Strategy
 */
public class CalculadoraPrecio {
    private EstrategiaDescuento estrategia;
    
    public CalculadoraPrecio(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }
    
    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }
    
    public double calcularPrecioFinal(double precio) {
        return estrategia.aplicarDescuento(precio);
    }
    
    public String getDescripcionDescuento() {
        return estrategia.getDescripcion();
    }
}