package MyPratice;

public class ParticularElementDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5};
        int target = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                count++;
            }
        }
        System.out.print(count);
    }
}
