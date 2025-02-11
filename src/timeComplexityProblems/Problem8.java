package src.timeComplexityProblems;

public class Problem8 {
    public static void main(String[] arcs) {
        // The time complexity of the code is O(log10(n))
        // The algorithm is logarithmic since the number of operations depends on the number of digits in num.

        int num = 12345;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
