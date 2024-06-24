package MyPratice.recursion;

public class Array {

    static int maxArray(int[] arr,int index) {
        if(index == arr.length-1){
            return arr[index];
        }
        int smallAns =maxArray(arr,index+1);
        return Math.max(arr[index],smallAns);
    }

    static int sumOfArray(int[] arr,int index){
        if(index == arr.length){
            return 0;
        }

        int smallAns = sumOfArray(arr,index+1);
        return smallAns + arr[index];
    }
    public static void main(String[] args) {
    int []arr = {1,2,3,4,5,6,7,8,9};
    System.out.println(maxArray(arr,0));
    System.out.println(sumOfArray(arr,0));

    }
}
