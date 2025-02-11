package src.timeComplexityProblems;

public class Factorial {
    public static void main(String[] args) {
        // The time complexity of the code is O(n)
        // The algorithm finds the factorial by iterating from 1 to n and multiplying in each iteration.

        int num = 5;
        int factorial = 1; //BigInteger can be used to avoid integer overflow

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}