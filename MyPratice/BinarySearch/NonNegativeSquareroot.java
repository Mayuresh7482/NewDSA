public class NonNegativeSquareroot {

    static int sqrt(int x){
        int start = 0, end = x;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid*mid == x){
                ans = mid;
                break;
            }
            if(mid*mid < x){
                start = mid+1;
                ans = mid;
            }
            else{
                end = mid-1;
            }
    }
        return ans;
    }

    public static void main(String[] args) {
        int x=25;
        System.out.println(sqrt(x));
    }
}
