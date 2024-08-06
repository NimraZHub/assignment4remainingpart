import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The factorial of " + num + " is : " + factorial(num));

    }
    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }
}