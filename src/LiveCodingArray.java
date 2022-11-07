import java.util.Scanner;

public class LiveCodingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int panjang = in.nextInt();in.nextLine();
        String[] text = new String[panjang];
        String nama = in.nextLine();

        System.out.println(nama);
        for (int i= 0; i< text.length; i++){
            System.out.printf("%s", text[i]);
            text[i] = in.next();
            if (i==text.length-1) continue;
            System.out.printf("-");
        }

    }
}
