package secondsemester;

    /*
 * Amber Stone
 * 01.31.20
 * Description: This program follows a specified list of instructions with a 
 * created text file and Exception Handling. Part of the following code was 
 * provided per Professor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling {

    //SIZE constant
    public static final int SIZE = 5;          

    public static void main(String[] args) throws FileNotFoundException {

        double[] data;
        int index;
        Scanner input;

        data = new double[SIZE];
        index = 0;

        /*The following code was modified from: 
         * https://codegym.cc/groups/posts/27-exceptions-catching-and-handling  
         */
        try {

            input = new Scanner(new File("input.txt")); //enter file name here

            while (input.hasNext()) {
                data[index] = input.nextDouble();
                System.out.println(data[index]);
                index++;

            }
        } catch (FileNotFoundException e) {

            System.out.println("Error! File not found!");
        } catch (InputMismatchException e) {

            System.out.println("Error! File must contain only numbers!");

        }
    }
}
