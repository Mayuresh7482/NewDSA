public class FirstOccurence {
    static boolean firstOccurence(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
               return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false; // target not found in array. Return -1.
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 5, 5, 6, 7, 8, 9 };
        int target = 5;
        System.out.println(firstOccurence(arr, target));
        target = 10;
        System.out.println(firstOccurence(arr, target));

    }
}
