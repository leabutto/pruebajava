
/*  Quick Sort en Java */

     //Nombre:Leandro Emanuel Butto
    //Legajo:VINF05534
   //DNI:31066100

class QuickSort {
    int particion(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low - 1); // índice del elemento más chico
        for (int j = low; j < high; j++) {
            // Si el elemento actual es más chico o igual que el pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Intercambia arr[i+1] y arr[high] (o pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /* Método principal que implementa quicksort
    arr[] --> Array a ser ordenado,
    low --> Comienzo de índice,
    high --> Fin de índice */
    void ordenar(int arr[], int low, int high) {
        if (low < high) {
            // Encuentra el índice del pivote, arr[p]
            int p = particion(arr, low, high);

            // Ordena los elementos antes y después del pivote
            ordenar(arr, low, p - 1);
            ordenar(arr, p + 1, high);
        }
    }

}
