package MyPratice.recursion;

import java.util.ArrayList;

public class UsingArraylist {
    static ArrayList<Integer> allIndices(int arr[], int n, int target, int index) {
        ArrayList<Integer> result = new ArrayList<>();
        if (index >= n) {
            return result; // return empty arraylist
        }

        if (arr[index] == target) {
            result.add(index); // add the index to the result list
        }
        ArrayList<Integer> ans = allIndices(arr, n, target, index + 1);
        result.addAll(ans);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 5, 5, 7, 8, 5, 10};
        int target = 5;
        int n = arr.length;
        ArrayList<Integer> list = allIndices(arr, n, target, 0);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
