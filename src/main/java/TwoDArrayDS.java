import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArrayDS {
    // Complete the hourglassSum function below.

    public static int[][] sampleInput = {
            {1, 1, 1 ,0, 0, 0},
            {0, 1, 0 ,0, 0, 0},
            {1, 1, 1 ,0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
    };

    static int hourglassSum(int[][] arr) {
        return 8;

    }


    public static void main(String[] args) {
        System.out.println(hourglassSum(sampleInput));
    }
}
