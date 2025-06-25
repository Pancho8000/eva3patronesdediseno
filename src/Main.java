package patronesdediseño;

/**
 * Clase principal que demuestra el uso de todos los patrones
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE RESTAURANTE ===");
        System.out.println("Demostrando 4 Patrones de Diseño\n");
        
        // 1. PATRÓN SINGLETON
        System.out.println("1. PATRÓN SINGLETON - RestauranteManager");
        RestauranteManager manager = RestauranteManager.getInstancia();
        System.out.println("Restaurante: " + manager.getNombreRestaurante());
        manager.reservarMesa();
        manager.reservarMesa();
        System.out.println();
        
        // 2. PATRÓN DECORATOR
        System.out.println("2. PATRÓN DECORATOR - Personalización de Platos");
        Plato pizza = new PlatoBase("Pizza Margherita", 12.00);
        System.out.println(pizza.getDescripcion() + " - $" + pizza.getPrecio());
        
        pizza = new ConQueso(pizza);
        System.out.println(pizza.getDescripcion() + " - $" + pizza.getPrecio());
        
        pizza = new ConSalsa(pizza);
        System.out.println(pizza.getDescripcion() + " - $" + pizza.getPrecio());
        System.out.println();
        
        // 3. PATRÓN OBSERVER
        System.out.println("3. PATRÓN OBSERVER - Notificaciones de Cocina");
        Cocina cocina = new Cocina("Cocina Principal");
        Mesero mesero1 = new Mesero("Juan");
        Mesero mesero2 = new Mesero("María");
        
        cocina.agregarObservador(mesero1);
        cocina.agregarObservador(mesero2);
        
        cocina.prepararPedido(pizza.getDescripcion());
        System.out.println();
        
        // 4. PATRÓN STRATEGY
        System.out.println("4. PATRÓN STRATEGY - Estrategias de Descuento");
        double precioOriginal = pizza.getPrecio();
        
        CalculadoraPrecio calculadora = new CalculadoraPrecio(new SinDescuento());
        System.out.println("Precio original: $" + precioOriginal + " (" + calculadora.getDescripcionDescuento() + ")");
        
        calculadora.setEstrategia(new DescuentoEstudiante());
        double precioEstudiante = calculadora.calcularPrecioFinal(precioOriginal);
        System.out.println("Precio con descuento: $" + String.format("%.2f", precioEstudiante) + " (" + calculadora.getDescripcionDescuento() + ")");
        
        calculadora.setEstrategia(new DescuentoTerceraEdad());
        double precioTerceraEdad = calculadora.calcularPrecioFinal(precioOriginal);
        System.out.println("Precio con descuento: $" + String.format("%.2f", precioTerceraEdad) + " (" + calculadora.getDescripcionDescuento() + ")");
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}