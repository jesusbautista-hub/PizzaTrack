public class PilaManual {
    private Nodo cima; // Este es nuestro dedo apuntando a la caja de más arriba

    public PilaManual() {
        this.cima = null; // Al principio, la pila está vacía (apunta a la nada)
    }

    // Método PUSH: Poner una pizza nueva en la cima de la pila
    public void push(Pizza nuevaPizza) {
        Nodo nuevaCaja = new Nodo(nuevaPizza); // 1. Metemos la pizza en una caja nueva
        nuevaCaja.siguiente = cima; // 2. La nueva caja se conecta a la que antes estaba arriba
        cima = nuevaCaja; // 3. Nuestro dedo ahora apunta a esta nueva caja como la nueva cima
        System.out.println("Se apiló: " + nuevaPizza.getNombre());
    }

    // Método POP: Quitar la pizza que está en la cima
    public Pizza pop() {
        if (cima == null) {
            System.out.println("La pila está vacía, no hay nada que deshacer.");
            return null; // Si no hay cajas, no hacemos nada
        }
        Pizza pizzaSacada = cima.pizza; // 1. Miramos qué pizza está en la caja de arriba
        cima = cima.siguiente; // 2. Bajamos nuestro dedo a la caja de abajo
        System.out.println("Se desapiló: " + pizzaSacada.getNombre());
        return pizzaSacada; // 3. Entregamos la pizza que sacamos
    }

    // Método extra para ver qué hay en la pila
    public void mostrarPila() {
        if (cima == null) {
            System.out.println("La pila de historial está vacía.");
            return;
        }
        Nodo actual = cima;
        System.out.println("--- Historial de Pizzas (De la más reciente a la más antigua) ---");
        while (actual != null) {
            System.out.println(actual.pizza.toString());
            actual = actual.siguiente; // Vamos bajando caja por caja
        }
        System.out.println("---------------------------------------------------------------");
    }
}
