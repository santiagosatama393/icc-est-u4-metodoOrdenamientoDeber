public class Shell {
    
    public void sort(int[] array, boolean asc) {
        int[] copia = array.clone();
        int comparaciones = 0, cambios = 0, iteraciones = 0;

        System.out.println("\n===== METODO SHELL =====");
        System.out.print("Arreglo original: ");
        imprimir(copia);

        int gap = copia.length / 2;
        while (gap > 0) {
            for (int i = gap; i < copia.length; i++) {
                int actual = copia[i];
                int j = i;
                iteraciones++;
                
                System.out.print("I" + iteraciones + " ");
                imprimir(copia);

                while (j >= gap) {
                    comparaciones++;
                    boolean condicion = asc ? (copia[j - gap] > actual) : (copia[j - gap] < actual);

                    if (condicion) {
                        copia[j] = copia[j - gap];
                        cambios++;
                        j -= gap;
                        System.out.println("      gap=" + gap + " cambio=si");
                    } else {
                        System.out.println("      gap=" + gap + " cambio=no");
                        break;
                    }
                }
                copia[j] = actual;
            }
            gap /= 2;
        }
        System.out.print("end "); imprimir(copia);
        System.out.println("\nCOMPARACIONES = " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("CAMBIOS       = " + cambios);
    }

    private void imprimir(int[] arreglo) {
        for (int val : arreglo) System.out.print(val + " ");
        System.out.println();
    }
}