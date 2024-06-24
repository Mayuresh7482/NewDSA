package MyPratice.bubbleSort;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
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

    public static void main(String[] args) {

        int[] arr = {10, 32, 101, 20, 230, 354, 67, 8};
        bubbleSort(arr);
        for (int a : arr)
            System.out.print(a + " ");
    }
}
