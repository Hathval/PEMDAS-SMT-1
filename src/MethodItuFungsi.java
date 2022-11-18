

public class MethodItuFungsi{ //args kepanjangan dari argumen
    public static void main(String[] args) {   //ini adalah fungsi utama pada java println adalah fungsi juga
        System.out.println(sayHai("Rochman", 20));
        System.out.println(penjumlahan(78, 98));
        System.out.println(fungsiXLatihan(2));
        grafik(21);
        System.out.println(faktorial(5));
        System.out.println(faktorialLoop(5));
    }

    //fungsi
    public static String sayHai(String nama, int umur){   //tubuh fungsi, biasanya line yang memilihi akhiran block statement
        return "Hai "+ nama+ " umurmu " + umur; // tidak perlu inisialisasi tipe data nama karena sudah inisialisasi di body method
    }

    public static int penjumlahan(int a, int b) { //bisa diganti int  bukan hanya string
        int hasil = a+b;
        return hasil;
    }
    //menghitung memakai code  f(x) = x^2 + 5x + 20
    public static int fungsiXLatihan(int x) {
        int a = x * x ;
        int b = 5  * x;
        int c = 20;
        int hasil = a+b+c;
        return hasil;
    }

    //prosedur
    public static void grafik(int banyakInterval) {
        for (int i= 0;i<banyakInterval;i++){
            System.out.println(i + " = " + fungsiXLatihan(i));
        }
        return;
    }

    public static int faktorial(int bil) {
        // rekursif pertama bil = 4
        // rekursif kedua bil = 3
        // rekursif ketiga bil = 2
        // rekursif keempat bil = 1
        if (bil == 1)
            return 1;
        else
            return (bil * faktorial(bil-1));
        // 4 * faktorial(3)
        // 3 * faktorial(2)
        // 2 * faktorial(1)
        // 1

        // 4 * 3 * 2 * 1
    }

    public static int faktorialLoop (int bil) {
        int hasil = 1;
        for (int i = bil; i>=1; i--) {
            hasil *= i;
        }
        return hasil;
    }
}

