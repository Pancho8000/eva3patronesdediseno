package patronesdediseño;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Observable para el patrón Observer
 */
public class Observable {
    private List<Observer> observadores = new ArrayList<>();
    
    public void agregarObservador(Observer observer) {
        observadores.add(observer);
    }
    
    public void removerObservador(Observer observer) {
        observadores.remove(observer);
    }
    
    public void notificarObservadores(String mensaje) {
        for (Observer observer : observadores) {
            observer.actualizar(mensaje);
        }
    }
}