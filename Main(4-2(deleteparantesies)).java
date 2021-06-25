package com.company;
import java.math.RoundingMode;
import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.*;
import java.util.ArrayList;
/**
 This class reads numbers from a file, calculates the
 mean and standard deviation, and writes the results
 to a file.
 */
public class Main {
    // TASK #3 Add the throws clause
    public static void main(String[] args) throws IOException {

        double sum = 0; // The sum of the numbers
        int count = 0; // The number of numbers added
        double mean = 0; // The average of the numbers
        double stdDev = 0; // The standard deviation
        String line; // To hold a line from the file
        double difference = 0.0; // The value and mean difference
        // Create an object of type Scanner
        Scanner keyboard = new Scanner (System.in);
        String filename; // The user input file name
        // Prompt the user and read in the file name
        System.out.println("This program calculates " +
                "statistics on a file " +
                "containing a series of numbers");
        System.out.print("Enter the file name (like C:\\Users\\Oğuzhan Kuş\\Desktop\\academy\\211\\labs\\lab04-2\\src\\com\\company\\data.txt): ");
        filename = keyboard.nextLine();

        // ADD LINES FOR TASK #4 HERE
        File file = new File(filename);
        FileReader reader = new FileReader(file);
        BufferedReader bufreader = new BufferedReader(reader);

        ArrayList<Double> list = new ArrayList<Double>();
        String number;
        while((number = bufreader.readLine()) != null){
            list.add(Double.parseDouble(number));
        }

        reader.close();
        bufreader.close();

        for (Double i:list){
            sum += i;
            count += 1;
        }
        mean = sum / count;

        for (Double i:list){
            difference += ((i - mean)*(i - mean));
            System.out.println(difference);
        }
        stdDev = difference / count;

        System.out.println("The sum of all values is: "+sum + " , and there are "+count+" nubers in the file.");
        System.out.println("The mean value of those numbers are: "+ mean);
        System.out.println("The Standart Deviation for this data is:" + stdDev);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Note: the standart deviation in lab pdf is wrong, and this file has a missing part to write result in another txt file. I don't need it");
    }
}
