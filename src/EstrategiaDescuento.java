package patronesdediseño;

/**
 * Interfaz para el patrón Strategy - Estrategias de descuento
 */
public interface EstrategiaDescuento {
    double aplicarDescuento(double precio);
    String getDescripcion();
}