public class shell {

    public void sort(int[] array, boolean asc) {

        int[] copia = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println("\n===== METODO SHELL =====\n");

        System.out.println("Arreglo original:");
        imprimir(copia);

        int gap = copia.length / 2;

        while (gap > 0) {

            for (int i = gap; i < copia.length; i++) {

                int actual = copia[i];
                int j = i;
                iteraciones++;

                System.out.println("\nIteracion " + iteraciones + " gap=" + gap);

                while (j >= gap) {

                    comparaciones++;

                    if (asc == true) {
                        if (copia[j - gap] > actual) {
                            copia[j] = copia[j - gap];
                            cambios++;
                            imprimir(copia);
                            j = j - gap;
                        } else {
                            break;
                        }
                    } else {
                        if (copia[j - gap] < actual) {
                            copia[j] = copia[j - gap];
                            cambios++;
                            imprimir(copia);
                            j = j - gap;
                        } else {
                            break;
                        }
                    }
                }

                copia[j] = actual;
                imprimir(copia);
            }

            gap = gap / 2;
        }

        System.out.println("\nArreglo ordenado por Shell:");
        imprimir(copia);

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Iteraciones: " + iteraciones);
    }

    public void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "  ");
        }
        System.out.println();
    }
}