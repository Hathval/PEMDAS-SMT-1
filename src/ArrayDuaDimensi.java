import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuaDimensi {
    public static void main(String[] args) {
        int [][] arrays = new int [3][5];
        arrays [0][1] = 8;
        arrays [1][1] = 10;
        arrays [0][4] = 11;
        arrays [2][1] = 8;

        System.out.println(Arrays.deepToString(arrays)); // untuk arrays multi dimensi
        System.out.println(Arrays.toString(arrays[0])); // untuk array 1 dimensi
        System.out.println(arrays[0][1]); // untuk memanggil suatu koordinat dalam arrays
    }
}
