/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Dora Du
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        // 1. add
        int sumOfTwo = add(3, 8);
        System.out.println("Result 1: " + sumOfTwo);

        // 2. add
        int sumOfFour = add(3, 8, 4, 9);
        System.out.println("Result 2: " + sumOfFour);

        // 3. morningGreeting
        String morningMsg = morningGreeting("Toby Fox");
        System.out.println("Result 3: " + morningMsg);

        // 4. afternoonGreeting
        String afternoonMsg = afternoonGreeting("Mac Miller");
        System.out.println("Result 4: " + afternoonMsg);

        // 5. triple
        String tripledWord = triple("oohbaby");
        System.out.println("Result 5: " + tripledWord);

        // 6. half
        double halfValue = half(17);
        System.out.println("Result 6: " + halfValue);

        // 7. roundPositiveValueToNearestInteger
        int roundedPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println("Result 7: " + roundedPositive);

        // 8. roundNegativeValueToNearestInteger
        int roundedNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println("Result 8: " + roundedNegative);
    }

    // 1. add (two parameters)
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // 2. add (four parameters)
    public static int add(int num1, int num2, int num3, int num4) {
        int firstPair = add(num1, num2);
        int secondPair = add(num3, num4);
        return add(firstPair, secondPair);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String text) {
        return text + text + text;
    }

    // 6. half
    public static double half(int value) {
        return (double) value / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) (value + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value) {
        return (int) (value - 0.5);
    }
}