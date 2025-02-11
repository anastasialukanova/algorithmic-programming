package src.timeComplexityProblems;

public class Fibonacci {
    public static void main(String[] arcs) {
        // The algorithm generates the Fibonacci series up to n terms by iterating n times
        // The time complexity is O(n), and the algorithm is linear.

        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");

        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
