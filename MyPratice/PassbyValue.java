package MyPratice;

public class PassbyValue {
    static void change(int a) {
        a = 20;
        System.out.println("Inside change: " + a);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before change: " + x);
        change(x);
        System.out.println("After : " + x);
    }
}
