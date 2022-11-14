import java.util.Arrays;

public class ConvenienceClass {
    public static void main(String[] args) {
        int i,j;

        for (i=0, j=1;i<8; ++i, ++j){
            System.out.printf("%d + %d = %d\n", i, j, i+j);
        }
    }
}
