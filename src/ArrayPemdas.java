import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPemdas {
    public static void main(String[] args) {

//        int[] numbers = new int[10];
//        //        numbers[10] = 90;   error karena out of bounds karena array dimulai dari
//        //        nol jadi arrays [10] memiliki range 0-9
//        numbers[2] = 20;
//        numbers[0] = 5;

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("index ke - %d value = %d\n", i, numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
