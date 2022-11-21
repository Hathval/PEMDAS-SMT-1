import java.util.Scanner;

public class HackerrankFungsi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int panjang = s.nextInt();

        float[] text = new float[panjang];
        
        for (int i = 0; i < text.length; i++) {
            text[i] = s.nextFloat();
            System.out.println(text[i]);
        }
        float terkecil = getSmallest(text,panjang);

        System.out.println("Index position of is: " + findIndex(text,terkecil));
    }
    public static float getSmallest(float[] a, float total){
        float temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
    public static float findIndex(float arr[], float t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

}