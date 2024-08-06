import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of persons: ");
        int n = input.nextInt();
        if(n < 1){
            System.out.println("The number of persons must be greater than or equal to 1");
        }
        else{
            System.out.println("Total number of hand shakes are: " + handShakes(n));
        }

    }
    public static int handShakes(int n){
        if (n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }
        else{
            return handShakes(n-1) + (n-1);
        }
    }
}
