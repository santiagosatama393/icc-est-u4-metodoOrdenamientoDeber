import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};

        int opcion;

        do {
            System.out.println("\n==== PROGRAMA DE ORDENAMIENTO ====");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Insercion ascendente? true/false: ");
                boolean ascInsercion = sc.nextBoolean();

                System.out.print("Shell ascendente? true/false: ");
                boolean ascShell = sc.nextBoolean();

                Insertion insercion = new Insertion();
                shell shell = new shell();

                insercion.sort(arreglo, ascInsercion);
                shell.sort(arreglo, ascShell);


            } else if (opcion == 2) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opcion incorrecta");
            }

        } while (opcion != 2);

        sc.close();
    }
}