package src.timeComplexityProblems;

public class Problem4 {
    public static void main(String[] arcs) {
        // The time complexity is O(n)
        // This algorithm is linear, each character in the string is processed once

        String str = "Hello";
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed);
    }
}
