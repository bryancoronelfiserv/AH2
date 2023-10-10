import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = isPrime(number);
        System.out.println(isPrime);
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (number <= 3) {
            return true; // 2 and 3 are prime
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Divisible by 2 or 3 (other than 2 and 3) are not prime
        }

        // Check for prime by iterating up to the square root of the number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Divisible by numbers in the form i or i+2 is not prime
            }
        }
        return true; // If no divisors found, the number is prime
    }
}