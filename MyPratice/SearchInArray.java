package MyPratice;

public class SearchInArray {

    public static void main(String[] args) {

        // Linear Search
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // Best Case : O(1)
        // Worst Case : O(n)
        // Average Case : O(n)

        int[] a = {12, 34, 56, 7, 8, 56, 5, 978};
        int ans = -1;
        int target = 56;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println(" Not found ");
        }
        System.out.println("target : " + target + " index :   " + ans);
    }
}
