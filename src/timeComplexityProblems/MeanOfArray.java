package src.timeComplexityProblems;

public class MeanOfArray {
    public static void main(String[] args) {
        // The time complexity of the code is O(n)
        // The algorithm finds the average by calculating the sum of the array
        // and then dividing the sum by the array length

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double mean = (double) sum / arr.length;
        System.out.println("The mean of the array is: " + mean);
    }
}
