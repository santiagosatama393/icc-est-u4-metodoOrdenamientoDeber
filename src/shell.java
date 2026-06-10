public class shell {

    public void sort(int[] array, boolean asc) {
        int[] copia = array.clone();
        int comparaciones = 0, cambios = 0, iteraciones = 0;

        System.out.println("\n===== METODO SHELL =====");
        System.out.print("Arreglo original: ");
        for (int v : copia) {
            System.out.print(v + " ");
        }
        System.out.println();

        int gap = copia.length / 2;

        while (gap > 0) {
            for (int i = gap; i < copia.length; i++) {
                iteraciones++;

                int temp = copia[i];
                int j = i;

                System.out.print("\nI" + iteraciones + "  ");
                for (int v : copia) {
                    System.out.print(v + "  ");
                }
                System.out.println();

                while (j >= gap) {
                    comparaciones++;

                    boolean condicion = asc 
                            ? copia[j - gap] > temp 
                            : copia[j - gap] < temp;

                    System.out.print("      gap=" + gap 
                            + " a=" + (j - gap) 
                            + " b=" + j 
                            + " [a]=" + copia[j - gap] 
                            + " [b]=" + temp);

                    if (condicion) {
                        System.out.println("  cambio=si");

                        copia[j] = copia[j - gap];
                        j -= gap;
                        cambios++;
                    } else {
                        System.out.println("  cambio=no");
                        break;
                    }
                }

                copia[j] = temp;
            }

            gap /= 2;
        }

        System.out.print("\nArreglo ordenado: ");
        for (int v : copia) {
            System.out.print(v + " ");
        }

        System.out.println("\nCOMPARACIONES = " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("CAMBIOS       = " + cambios);
    }
}