package src.timeComplexityProblems;

public class Problem2 {
    public static void main(String[] args) {
        int n = 5;

        // The time complexity of this code is O(n^2)
        // The algorithm is quadratic, since the runtime is proportional to the square of the input size n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
