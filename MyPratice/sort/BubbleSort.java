package MyPratice.sort;

public class BubbleSort {
    // O(n^2) time complexicity
// space complexity
    static void bubbleSort(int[] arr) {
        // Traverse through all array elements
        for (int i = 0; i <= arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    static void print(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 32, 101, 20, 230, 354, 67, 8};
        bubbleSort(arr);
        print(arr);
    }
}
