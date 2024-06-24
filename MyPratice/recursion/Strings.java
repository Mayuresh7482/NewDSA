package MyPratice.recursion;

import java.util.Scanner;

public class Strings {
    static String removeAccents(String str, int index) {
        if(index == str.length()){
            return " ";
        }
        String smallAns =removeAccents(str, index+1);
        char currentChar = str.charAt(index);
        if(currentChar != 'a'){
            return currentChar+smallAns;
        }
        return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeAccents(s,0));
    }
}
