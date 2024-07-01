package MyPratice.sort;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

    }

    public static void main(String[] args) {
        int arr[] = {11, 5, 2, 1, 9};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
