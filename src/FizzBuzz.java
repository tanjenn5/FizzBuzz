/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1; // assigning variables
        while (i++ < 100) { // while loop is similar to python

            doFizzBuzz(i);
        }
    }

    private static void doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0; // boolean statements
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        // && refers to and, || refers to or
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz"); // printing OUT

        } else if (divisibleBy3) { // similar to elif in python, el(se) if

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
