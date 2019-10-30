import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//1
public class TwoDArrayDS {

    public static int[][] sampleInput = {
            {1, 1, 1 ,0, 0, 0},
            {0, 1, 0 ,0, 0, 0},
            {1, 1, 1 ,0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
    };

    static int hourglassSum(int[][] arr) {
        List<Integer> listOfTotals = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    int one = arr[i][j];
                    int two = arr[i][j + 1];
                    int three = arr[i][j + 2];
                    int middle = arr[i + 1][j + 1];
                    int four = arr[i + 2][j];
                    int five = arr[i + 2][j + 1];
                    int six = arr[i + 2][j + 2];
                    int iTotal = one + two + three + middle + four + five + six;
                    listOfTotals.add(iTotal);
                } catch(ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
        Collections.sort(listOfTotals);
        return listOfTotals.get(listOfTotals.size() -1);
    }

    public static int[][] sout(int[][] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr[i].length -1; j++) {
                System.out.println(arr[i][j] + " is at index " + i+j);
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(hourglassSum(sampleInput));
    }
}
