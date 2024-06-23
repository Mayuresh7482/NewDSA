package MyPratice;

public class LastIndexDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5};
        int target = 5;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                lastIndex = i;
            }
        }
        System.out.print("Target : " + target + " Last index :  " + lastIndex);
    }
}
