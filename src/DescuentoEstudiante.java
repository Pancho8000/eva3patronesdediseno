package patronesdediseño;

/**
 * Estrategia concreta - Descuento para estudiantes
 */
public class DescuentoEstudiante implements EstrategiaDescuento {
    
    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.85; // 15% de descuento
    }
    
    @Override
    public String getDescripcion() {
        return "Descuento estudiante (15%)";
    }
}