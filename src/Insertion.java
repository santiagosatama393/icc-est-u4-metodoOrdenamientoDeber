public class Insertion {
    public void sort(int[] array, boolean asc) {
        int[] copia = array.clone(); // Trabajar con copia
        int comparaciones = 0, cambios = 0, iteraciones = 0;

        System.out.println("\n===== METODO INSERCIÓN =====");
        System.out.print("Arreglo original: ");
        for (int v : copia) System.out.print(v + " ");
        System.out.println();

        for (int i = 1; i < copia.length; i++) {
            iteraciones++;
            System.out.print("\nI" + iteraciones + "  ");
            for (int v : copia) System.out.print(v + "  ");
            System.out.println();

            int j = i;
            while (j > 0) {
                comparaciones++;
                int a = j - 1;
                int b = j;
                boolean condicion = asc ? (copia[a] > copia[b]) : (copia[a] < copia[b]);

                
                System.out.print("      a=" + a + " b=" + b + " [a]=" + copia[a] + " [b]=" + copia[b]);

                if (condicion) {
                    System.out.println("  cambio=si");
                    int valorA = copia[a];
                    int valorB = copia[b];

                    
                    int aux = copia[a];
                    copia[a] = copia[b];
                    copia[b] = aux;
                    cambios++;

                    
                    System.out.print("      "); 
                    for (int k = 0; k < a; k++) System.out.print("   "); 
                    System.out.println(valorB);

                    System.out.print("      ");
                    for (int k = 0; k < b; k++) System.out.print("   ");
                    System.out.println(valorA);
                    
                    j--;
                } else {
                    System.out.println("  cambio=no");
                    break;
                }
            }
        }
        System.out.println("\nCOMPARACIONES = " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("CAMBIOS       = " + cambios);
    }
}