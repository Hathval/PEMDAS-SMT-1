import java.util.Scanner;

public class OrangTerpendekHR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int panjang = s.nextInt();
        int jadiNggak = panjang%2;
        if (jadiNggak==0){
            int status = 0;
            System.exit(0);
        }if (panjang>999&&panjang<1){
            int status = 0;
            System.exit(0);
        }
        int median = panjang/2 + 1;
        float[] text = new float[panjang];
        float copyArray[] = new float[text.length];
        for (int i = 0; i < text.length; ++i) {
            text[i] = s.nextFloat();
            if (text[i]>250.0&&text[i]<100.0){
                int status = 0;
                System.exit(0);
            }
        }
        s.close();
        for (int i=0; i<text.length; i++)
            copyArray[i] = text[i];
        float terkecil = getSmallest(copyArray, panjang);

        for (int k = median-1; k>0; k--){
            for (int p = median; p <= panjang-k; p++){
                if (text[p] <= terkecil) {
                    System.out.println(p + 1);
                    int status = 0;
                    System.exit(0);
                }
            }
            for (int q = median; q>=0+k; q--){
                    if (text[q] <= terkecil) {
                        System.out.println(q + 1);
                        int status = 0;
                        System.exit(0);
                    }
            }

        }
        System.out.println('1');

    }

    public static float getSmallest(float[] a, float total) {
        float temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    temp = a[i];
                }
            }
        }
        return a[0];
    }
}
