public class RecursiveBinarySearch {

    static boolean recBS(int[] a, int start, int end, int target) {
        if (start > end)
            return false;
        int mid = (start + end) / 2;
        if (a[mid] == target)
            return true;
        if (a[mid] > target)
            return recBS(a, start, mid - 1, target);
        return recBS(a, mid + 1, end, target);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 0;
        while (target != 10) {
            System.out.printf(" %d exists in array %b \n", target, recBS(arr, 0, arr.length - 1, target));
            target++;
        }
    }
}
