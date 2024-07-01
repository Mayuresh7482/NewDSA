package MyPratice.sort;

public class SelectionSort {
    static void selectionSort(int []arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min_index=i;
            for(int j=i+1; j < n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int arr[]={ 11,5 ,2,1,9};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Sorted array");
        for(int i: arr) {
            System.out.print(i+" ");
        }

    }
}
