package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

/**
 This class simulates rolling a pair of dice 10,000 times
 and counts the number of times doubles of are rolled for
 each different pair of doubles.
 */
        final int NUMBER = 10000; // Number of dice rolls
// A random number generator used in
// simulating the rolling of dice
        Random generator = new Random();
        int die1Value; // Value of the first die
        int die2Value; // Value of the second die
        int count = 0; // Total number of dice rolls
        int snakeEyes = 0; // Number of snake eyes rolls
        int twos = 0; // Number of double two rolls
        int threes = 0; // Number of double three rolls
        int fours = 0; // Number of double four rolls
        int fives = 0; // Number of double five rolls
        int sixes = 0; // Number of double six rolls
// TASK #1 Enter your code for the algorithm here
        int x = 0;
        while(x<NUMBER){
            x +=1;
            int d1 = generator.nextInt()%6;
            int d2 = generator.nextInt()%6;
            if(d1 < 0){
                d1 += 6;
            }else if(d1 ==  0){
                d1 = 6;
            }
            if(d2 < 0){
                d2 += 6;
            }else if (d2 == 0){
                d2 = 6;
            }
            if (d1 == d2){
                switch (d1){
                    case 1: snakeEyes += 1;
                    break;
                    case 2: twos += 1;
                    break;
                    case 3: threes += 1;
                    break;
                    case 4: fours += 1;
                    break;
                    case 5: fives += 1;
                    break;
                    case 6: sixes += 1;
                    break;
                    default: System.out.println("Something is broken");
                    return;
                }
            }
            count += 1;
        }



        // Display the results
        System.out.println("You rolled snake eyes " +
                snakeEyes + " out of " +
                count + " rolls.");
        System.out.println("You rolled double twos " +
                twos + " out of " + count +
                " rolls.");
        System.out.println("You rolled double threes " +
                threes + " out of " + count +
                " rolls.");
        System.out.println("You rolled double fours " +
                fours + " out of " + count +
                " rolls.");
        System.out.println("You rolled double fives " +
                fives + " out of " + count +
                " rolls.");
        System.out.println("You rolled double sixes " +
                sixes + " out of " + count +
                " rolls.");
    }
}
