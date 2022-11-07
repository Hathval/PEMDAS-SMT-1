import java.util.Scanner;
import java.lang.Math;

public class BilanganGanjil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rangeBil = in.nextInt();
        int comma=1;
        double oddRange = rangeBil/2;
        oddRange = +Math.ceil(oddRange);
        double oddRange2 = (int) oddRange;
        for (int i=1; i<=rangeBil; i++){
            if (i % 2 != 0) {
                System.out.printf("%d", i);
                if (comma<oddRange2){
                    System.out.printf(", ");
                    comma++;
                }
            }
        }
    }
}