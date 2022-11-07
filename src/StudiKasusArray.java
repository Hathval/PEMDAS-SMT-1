import java.util.Scanner;

public class StudiKasusArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan panjang array : ");
        int panjang = s.nextInt(); s.nextLine();

        String[] text = new String[panjang];

        for (int i=0; i< text.length; i++){
            System.out.printf("Masukkan isi array index ke-%d : ", i);
            text[i] = s.nextLine();
        }
        System.out.println("Isi array nama : ");
    }
}
