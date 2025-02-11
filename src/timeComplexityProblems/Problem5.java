package src.timeComplexityProblems;

public class Problem5 {
    public static void main(String[] arcs) {
        // The time complexity of the code is O(n)
        // The algorithm is linear, the loop goes through each element of the array list once,
        // and finds the maximum value

        int[] arr = {3, 7, 2, 9, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value: " + max);
    }
}
