package demo;

import java.util.Scanner;
public class booleans_and_logic {
    public static void main(String[] args) {
        /* BOOLEANS & LOGIC */

        // Booleans are either true (1) or false (0)
        boolean goodVideo = true;
        boolean subscribed = false;
        System.out.println("This is a good video " + goodVideo);

        boolean isCreative = false;
        System.out.println("Player is in Creative Mode: " + isCreative);

        // COMPARISONS (< <= >= > == !=)

        int points = 47;
        int pointsToPass = 55;
        boolean hasPassedTest = points >= pointsToPass; // Bigger or Equals
        System.out.println("Has passed the Test " + hasPassedTest);

        int health = 0;
        boolean isAlive = health > 0;
        System.out.println("Is Player Roman still alive? " + isAlive);

        boolean test = 100 == 100; // true
        test = 100 != 100; // false

        // LOGIC (AND OR NOT)

        // OR
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        // AND
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        // NOT
        // a | !a
        // 0 |  1
        // 1 |  0

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2; // true if BOTH are true!

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or false, are you from Canada?");
        boolean isCanadian = scanner.nextBoolean();

        int caDrinkingAge = 19;
        int usDrinkingAge = 21;

        boolean canDrink = isCanadian && age >= caDrinkingAge || !isCanadian && age >= usDrinkingAge;
        System.out.println("Can you drink? " + canDrink);

    }
}
