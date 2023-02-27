// Alexander Andrade Beltran
// 2/26/2023
// Largest of Three assignment

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // User inputs integers
        System.out.println("Hello user, please enter an integer");
        int integer1 = userInput.nextInt();
        System.out.println("Please enter another integer");
        int integer2 = userInput.nextInt();
        System.out.println("Please enter a third integer");
        int integer3 = userInput.nextInt();

        // Finding largest integer
        int largestInteger = integer1;
        if (integer2 > largestInteger) {largestInteger = integer2;}
        if (integer3 > largestInteger) {largestInteger = integer3;}

        System.out.println("The largest integer is" + " " + largestInteger);

        // Sum of three integers
        int sum = integer1 + integer2 + integer3;
        System.out.println("The sum of the three integers is" + " " + sum);
    }
}