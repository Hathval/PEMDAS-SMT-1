import java.util.Arrays;
import java.util.Scanner;

public class PemdasHRArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] arrays = new String[10][10];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = in.nextLine();
            }
        }
        int koor = in.nextInt();
        for (int x = 0; x < koor; x++) {
            for (int y = 0; y < koor; y++) {
                int a = in.nextInt();
                int b = in.nextInt();
            }
        }
    }
}

