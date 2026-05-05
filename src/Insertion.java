public class Insertion {

    public void sort(int[] array, boolean asc) {

        int[] copia = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println("\n===== METODO INSERCION =====\n");

        System.out.print("Arreglo original:\n");
        imprimir(copia);

        for (int i = 1; i < copia.length; i++) {

            iteraciones++;
            int j = i;

            System.out.println("\nI" + iteraciones);

            while (j > 0) {

                comparaciones++;

                int a = j - 1;
                int b = j;

                System.out.print("a=" + a + " b=" + b);
                System.out.print(" [a]=" + copia[a] + " [b]=" + copia[b]);

                boolean condicion;

                if (asc == true) {
                    condicion = copia[a] > copia[b];
                } else {
                    condicion = copia[a] < copia[b];
                }

                if (condicion) {

                    int aux = copia[a];
                    copia[a] = copia[b];
                    copia[b] = aux;

                    cambios++;

                    System.out.println(" cambio=si");
                    imprimir(copia);

                    j--;

                } else {
                    System.out.println(" cambio=no");
                    break;
                }
            }
        }

        System.out.println("\nend");
        imprimir(copia);

        System.out.println("\nCOMPARACIONES = " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("CAMBIOS       = " + cambios);
    }

    public void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}