public class Nodo {
    Pizza pizza; // El dato que guardamos
    Nodo siguiente; // El puntero a la siguiente pizza de abajo

    public Nodo(Pizza pizza) {
        this.pizza = pizza;
        this.siguiente = null;
    }
}