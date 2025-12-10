package Project;

public class QuickSort {

    public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);

            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, h);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}