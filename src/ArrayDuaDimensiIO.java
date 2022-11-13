import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuaDimensiIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arrays = new int [2][3];
        for (int i = 0; i< arrays.length; i++){
            for (int j =  0; j< arrays[i].length; j++){
                arrays[i][j] = in.nextInt();
//                System.out.print(arrays[i][j] + " ");
            }
        }
        System.out.println(Arrays.deepToString(arrays));
//        System.out.printf("\n");
        in.close();
    }
}
