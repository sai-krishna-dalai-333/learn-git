public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(1, 1000);
    }

    public static void printPrimeNumbers(int start, int end) {
        if (start == 1) start++;
        if (start == 2) {
            System.out.println(2);
            start++;
        }
        if (start % 2 == 0) start++;
        for (int number = start; number <= end; number += 2) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

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