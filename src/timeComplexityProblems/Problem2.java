package src.timeComplexityProblems;

public class Problem2 {
    public static void main(String[] args) {
        // The time complexity of this code is O(n^2)
        // The algorithm is quadratic, since the runtime is proportional to n squared

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
