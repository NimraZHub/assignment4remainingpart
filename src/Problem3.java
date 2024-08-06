import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Enter a digit: ");
        int digit = input.nextInt();
        if (n <= 0) {
            System.out.println("The number must be positive.");
        }
        else if (digit < 0 || digit > 9) {
            System.out.println("The digit must be between 0 and 9.");
        }
        else {
            int count = countDigit(n, digit);
            System.out.println("The digit " + digit + " appears " + count + " times in the number " + n);
        }
    }
    public static int countDigit(int n, int digit){
        if(n == 0){
            return 0;
        }
        int lastDigit = n % 10;
        if (lastDigit == digit) {
            return 1 + countDigit(n / 10, digit);
        } else {
            return countDigit(n / 10, digit);
        }
    }

}
