public class BinarySearch {

    static boolean binarySearch(int a[], int target) {
        int n = a.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == target)
                return true;
            if (a[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 0;
        while (target != 10) {
            System.out.printf(" %d exists in array %b \n", target, binarySearch(arr, target));
            target++;
        }
    }
}