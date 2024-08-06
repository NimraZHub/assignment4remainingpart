import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int length = str.length();
        System.out.println("The reverse of string is: " + reverse(str,length));

    }
    public static String reverse(String s, int length){
        if(length == 0 ){
            return " ";
        }
        else{
            return s.charAt(length-1) + reverse(s,length-1);
        }
    }
}
