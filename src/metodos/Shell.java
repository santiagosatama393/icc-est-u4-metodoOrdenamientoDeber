package metodos;

public class Shell {

    public static int[] sort(int[] arreglo, boolean asc) {
        int[] arr = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            arr[i] = arreglo[i];
        }

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println("\nMETODO SHELL");
        System.out.println("\nArreglo original:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }

        System.out.println();

        int gap = arr.length / 2;

        while (gap >= 1) {
            for (int i = gap; i < arr.length; i++) {
                iteraciones++;

                System.out.print("\nI" + iteraciones + "  ");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }

                int k = i;

                while (k >= gap) {
                    comparaciones++;

                    int a = k - gap;
                    int b = k;
                    boolean intercambio;

                    if (asc) {
                        intercambio = arr[a] > arr[b];
                    } else {
                        intercambio = arr[a] < arr[b];
                    }

                    System.out.println("     a = " + a +
                            " b = " + b +
                            " arr[a] = " + arr[a] +
                            " arr[b] = " + arr[b] +
                            " cambio = " + (intercambio ? "si" : "no"));

                    if (intercambio) {
                        int aux = arr[a];
                        arr[a] = arr[b];
                        arr[b] = aux;
                        cambios++;
                        k -= gap;
                    } else {
                        break;
                    }
                }
            }

            gap = gap / 2;
        }

        System.out.print("\nend   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("\nComparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Iteraciones: " + iteraciones);

        int[] resultado = {comparaciones, cambios, iteraciones};
        return resultado;
    }
}