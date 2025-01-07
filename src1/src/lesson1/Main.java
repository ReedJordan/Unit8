package lesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int[][] myGrid = new int[2][2];
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 2; col++){
                myGrid[row][col] = rand.nextInt(0,100);
            }
        }

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 2; col++){
                System.out.print(myGrid[row][col] + " ");

            }
            System.out.println();
        }


    }
}