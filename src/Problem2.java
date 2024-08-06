import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string or numbers to check whether they're palindrome or not: ");
        String str = input.nextLine();
        // Preprocess the string to remove non-alphanumeric characters and convert to lower case
        str = preprocessString(str);
        if(ispalindrome(str, str.length()) == 1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }

    private static String preprocessString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static int ispalindrome(String s, int len){
        if(len <= 1) {
            return 1;
        }
        else if (s.charAt(0) != s.charAt(len-1)){
            return 0;
        }
        else{
            return ispalindrome(s.substring(1, len - 1), len - 2);
        }
    }
}

