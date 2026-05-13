import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilaManual historial = new PilaManual();
        int opcion = 0;

        System.out.println("🍕 ¡Bienvenido a Pizza-Track! 🍕");

        while (opcion != 4) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Pedir nueva Pizza (Push)");
            System.out.println("2. Deshacer último pedido (Pop)");
            System.out.println("3. Ver historial de pedidos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiamos el buffer

            if (opcion == 1) {
                System.out.print("Nombre de la pizza (ej. Hawaiana): ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrediente 1: ");
                String ing1 = scanner.nextLine();
                System.out.print("Ingrediente 2: ");
                String ing2 = scanner.nextLine();
                System.out.print("Ingrediente 3: ");
                String ing3 = scanner.nextLine();

                Pizza nueva = new Pizza(nombre, ing1, ing2, ing3);
                historial.push(nueva);
                System.out.println("✅ ¡Pizza agregada con éxito!");

            } else if (opcion == 2) {
                historial.pop();
                
            } else if (opcion == 3) {
                historial.mostrarPila();
                
            } else if (opcion == 4) {
                System.out.println("👋 ¡Gracias por usar Pizza-Track! Saliendo...");
            } else {
                System.out.println("❌ Opción no válida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }
}