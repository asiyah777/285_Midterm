public class factorialcalculator {
    public static void main(String[] args) {
        int num = 25;  // Predefined number to calculate factorial
        int factorial = 1;

        for (int x = 0; x <= num; x++) { // Loop through numbers
            factorial *= x;  // Multiply current number
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
