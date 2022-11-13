import java.util.Scanner;

public class SegitigaBintangT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int j = 0;
        int r = row;
        for (int i = 0; i <= row; i++) {
            for (j = 1; j <= r; j++) {
                System.out.print("*");
            }
            for (int k = j; k <= row; k++) {
                System.out.print(" ");
            }
            r--;
            System.out.println("");
        }
    }
}