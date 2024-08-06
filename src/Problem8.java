import java.util.Scanner;

public class Problem8 {
    static final long MODULO = 1000000007;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of p: ");
        int p = input.nextInt();
        System.out.println("The minimum product for " + p + " is: " + minProduct(p));
    }
    public static long minProduct(int p) {
        long maxNum = (1L << p) - 1; // 2^p - 1
        long remain = maxNum - 1;
        long pairs = remain / 2;
        long minProduct = quickMul(remain, pairs) * (maxNum % MODULO) % MODULO;
        return minProduct;
    }
    // Modular exponentiation
    public static long quickMul(long x, long n) {
        x %= MODULO;
        long power = 1;
        while (n > 0) {
            if (n % 2 == 1)
                power = power * x % MODULO;
            x = x * x % MODULO;
            n /= 2;
        }
        return power;
    }
}
