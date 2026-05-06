import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};
        int opcion = 0;

        do {
            System.out.println("\n==== PROGRAMA DE ORDENAMIENTO ====");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.next(); 
                continue;
            }

            if (opcion == 1) {
                try {
                    System.out.print("¿Inserción ascendente? (true/false): ");
                    boolean ascInsercion = sc.nextBoolean();

                    System.out.print("¿Shell ascendente? (true/false): ");
                    boolean ascShell = sc.nextBoolean();

                    Insertion insercion = new Insertion();
                    Shell shell = new Shell();

                    // Llamada a métodos void según el diagrama UML
                    insercion.sort(arreglo, ascInsercion);
                    shell.sort(arreglo, ascShell);

                } catch (Exception e) {
                    System.out.println("Error: Entrada no válida.");
                    sc.next();
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo...");
            }
        } while (opcion != 2);
        sc.close();
    }
}