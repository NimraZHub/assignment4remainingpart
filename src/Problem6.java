import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of base: ");
        int base = input.nextInt();
        System.out.println("Enter a number of exponent: ");
        int exponent = input.nextInt();
        System.out.println( base + " raise to power " + exponent + " is " + power(base , exponent) );

    }
    public static int power(int x, int y){
        if(y == 0){
            return 1;
        }
        else{
            return x * power(x, y-1);
        }
    }
}
