import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of x: ");
        int x = input.nextInt();
        System.out.println("Enter a number of y: ");
        int y = input.nextInt();
        System.out.println("The greatest common divisor of " + x + " and " + y + " is " + gcd(x,y));
    }
    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return gcd(y,x % y);
        }
    }
}
