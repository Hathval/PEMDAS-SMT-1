public class TugasPemdasLK1 {
    public static void main(String[] args) {
        int x, y, z ;

        for (x=0; x<4; x++) {
            for (y = 0; y < 3; y++) {
                for (z=0; z<3; z++) {
                    if (z == 2) break;
                }
                System.out.printf("Selamat\n");
            }
            System.out.printf("Datang\n");
        }
        System.out.printf("di TIF-FILKOMUB\n");
    }
}

