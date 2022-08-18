public class PrintSomeNumbers {
    public static void main(String[] args) {
        float[] someNumbers= {39, 11, 41, 8, 43, 5, 45, 2, 47, -1, 49, -4, 51, -7, 53, -10, 55, -13, 57, -16};
        for (int i = 0; i < someNumbers.length; i++) {
            System.out.print(someNumbers[i]);
            if (i < someNumbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
