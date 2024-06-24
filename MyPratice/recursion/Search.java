package MyPratice.recursion;

public class Search {

    static boolean search(int []arr,int n,int target ,int index){

        if(index>=n){
            return false;
        }

        if(arr[index]==target){
            return true;
        }

        return search(arr,n,target,index+1);
    }

    static int findIndex(int []arr,int n,int target,int index){
        if(index>=n){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,n,target,index+1);
    }

    static void findAllIndices(int []arr,int n,int target,int index){
        if(index>=n){
            return;
        }
        if(arr[index]==target){
            System.out.print(index+" ");
        }
        findAllIndices(arr,n,target,index+1);

    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,4,5,5,7,8,5,10};
        int target = 5;
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        if(search(arr,n,target,0)){
            System.out.println(target + " found at index "+findIndex(arr,n,target,0));
        }
        else {
            System.out.println("Element not found");
        }

        System.out.println();

        if(search(arr,n,target,0)){
            System.out.println(target + " found at index ");
            findAllIndices(arr,n,target,0);
        }
        else {
            System.out.println("Element not found");
        }


    }
}
