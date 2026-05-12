public class Pizza {
    private String nombre;
    private String[] ingredientes; // El arreglo fijo de 3 que pide tu profesor

    public Pizza(String nombre, String ing1, String ing2, String ing3) {
        this.nombre = nombre;
        this.ingredientes = new String[3];
        this.ingredientes[0] = ing1;
        this.ingredientes[1] = ing2;
        this.ingredientes[2] = ing3;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pizza: " + nombre + " | Ingredientes: [" + ingredientes[0] + ", " + ingredientes[1] + ", " + ingredientes[2] + "]";
    }
}