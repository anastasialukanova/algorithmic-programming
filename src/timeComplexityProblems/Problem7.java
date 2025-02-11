package src.timeComplexityProblems;

public class Problem7 {
    public static void main(String[] args) {
        // The time complexity of the code is O(1)
        // The algorithm is constant time, it swaps the values of two variables
        // without the need for a temporary variable.

        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
