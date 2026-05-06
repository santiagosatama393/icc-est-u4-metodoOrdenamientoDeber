public class Shell {
    public void sort(int[] array, boolean asc) {
        int[] copia = array.clone();
        int comparaciones = 0, cambios = 0, iteraciones = 0;

        System.out.println("\n===== METODO SHELL =====");
        System.out.print("Arreglo original: ");
        for (int v : copia) System.out.print(v + " ");
        System.out.println();

        int gap = copia.length / 2;
        while (gap > 0) {
            for (int i = gap; i < copia.length; i++) {
                iteraciones++;
                System.out.print("\nI" + iteraciones + "  ");
                for (int v : copia) System.out.print(v + "  ");
                System.out.println();

                int j = i;
                while (j >= gap) {
                    comparaciones++;
                    int ant = j - gap;
                    boolean condicion = asc ? (copia[ant] > copia[j]) : (copia[ant] < copia[j]);

                    
                    System.out.print("      gap=" + gap + " a=" + ant + " b=" + j + " [a]=" + copia[ant] + " [b]=" + copia[j]);

                    if (condicion) {
                        System.out.println("  cambio=si");
                        int valorA = copia[ant];
                        int valorB = copia[j];

                        int aux = copia[j];
                        copia[j] = copia[ant];
                        copia[ant] = aux;
                        cambios++;

                        
                        System.out.print("      ");
                        for (int k = 0; k < ant; k++) System.out.print("   ");
                        System.out.println(valorB);

                        System.out.print("      ");
                        for (int k = 0; k < j; k++) System.out.print("   ");
                        System.out.println(valorA);

                        j -= gap;
                    } else {
                        System.out.println("  cambio=no");
                        break;
                    }
                }
            }
            gap /= 2;
        }
        System.out.println("\nCOMPARACIONES = " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("CAMBIOS       = " + cambios);
    }
}