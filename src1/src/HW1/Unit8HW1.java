package HW1;

import java.util.Random;
import java.util.Scanner;

public class Unit8HW1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        //make your own 2D test array of integers (or whatever)
        int[][] hwArray = new int[5][5];
        for (int row = 0; row < hwArray.length; row++) {
            for (int col = 0; col < hwArray[0].length; col++) {
                hwArray[row][col] = rand.nextInt(0, 100);
            }
        }

        //ask user for column number
        System.out.println("What column do you want to see?");
        int userColumn = input.nextInt();

        //make sure it is a valid option
        if (userColumn > hwArray[0].length || userColumn <= 0){
            System.out.println("Invalid column selected.");
            System.exit(0);
        }

        //print the column number they asked for with each element on a new line

        System.out.print("Column "+ userColumn +": ");
            for(int row = 0; row < hwArray.length; row++){
                System.out.print(hwArray[row][userColumn] +" ");
            }


    }

    public static void columnPrinter(int columnNumber) {
        System.out.println("");
    }
}