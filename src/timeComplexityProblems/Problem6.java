package src.timeComplexityProblems;

public class Problem6 {
    public static void main(String[] arcs) {
        // The time complexity of the code is O(√n)
        // The algorithm checks divisibility up to the square root of the input number,
        // in order to check if the number is prime

        int num = 29;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + " is prime: " + isPrime);
    }
}
