public class Insertion {
  
    public void sort(int[] array, boolean asc) {
        int[] copia = array.clone();
        int comparaciones = 0, cambios = 0, iteraciones = 0;

        System.out.println("\n===== METODO INSERCION =====");
        System.out.print("Arreglo original: ");
        imprimir(copia);

        for (int i = 1; i < copia.length; i++) {
            iteraciones++;
            int j = i;
            System.out.print("I" + iteraciones + " ");
            imprimir(copia);

            while (j > 0) {
                comparaciones++;
                int a = j - 1;
                int b = j;
                boolean condicion = asc ? (copia[a] > copia[b]) : (copia[a] < copia[b]);

                if (condicion) {
                    int aux = copia[a];
                    copia[a] = copia[b];
                    copia[b] = aux;
                    cambios++;
                    System.out.println("      a=" + a + " b=" + b + " [a]=" + copia[b] + " [b]=" + copia[a] + " cambio=si");
                    j--;
                } else {
                    System.out.println("      a=" + a + " b=" + b + " [a]=" + copia[a] + " [b]=" + copia[b] + " cambio=no");
                    break;
                }
            }
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