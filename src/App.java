import java.util.Scanner;
import metodos.Insertion;
import metodos.Shell;

public class App {
    public static void main(String[] args) {
        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nPROGRAMA DE ORDENAMIENTO:");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                boolean insertionAsc = leerBoolean(sc, "Insercion ascendente? (true/false)");
                boolean shellAsc = leerBoolean(sc, "Shell ascendente? (true/false)");

                int[] arregloInsertion = arreglo.clone();
                int[] arregloShell = arreglo.clone();

                Insertion.sort(arregloInsertion, insertionAsc);
                Shell.sort(arregloShell, shellAsc);

            } else if (opcion == 2) {
                System.out.println("Programa finalizado");
            } else {
                System.out.println("Opción incorrecta. Ingresar 1 o 2.");
            }

        } while (opcion != 2);

        sc.close();
    }

    public static boolean leerBoolean(Scanner sc, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String valor = sc.next();

            if (valor.equals("true")) {
                return true;
            } else if (valor.equals("false")) {
                return false;
            } else {
                System.out.println("Valor inválido. Debe ingresar exactamente true o false.");
            }
        }
    }
}
