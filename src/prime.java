import  java.util.Scanner;
public class prime {

    static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }



    public static void main(String[] args) {
        int number = 33;
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
