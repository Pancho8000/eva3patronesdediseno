package patronesdediseño;

/**
 * Estrategia concreta - Descuento para tercera edad
 */
public class DescuentoTerceraEdad implements EstrategiaDescuento {
    
    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.80; // 20% de descuento
    }
    
    @Override
    public String getDescripcion() {
        return "Descuento tercera edad (20%)";
    }
}