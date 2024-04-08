import java.util.*;

/*public class Ganapathi
{
    public static void main(String args[])
    {
        System.out.println("welcome");
    }
}*/



public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(1, 1000);
    }

    public static void printPrimeNumbers(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
/**
 * This method checks if a number is prime.
 *
 * @param number the number to check
 * @return true if the number is prime, false otherwise
 */
public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    if (number == 2) {
        return true;
    }
    if (number % 2 == 0) {
        return false;
    }
    for (int i = 3; i <= Math.sqrt(number); i += 2) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}
    
}




