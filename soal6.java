import java.util.Scanner;
public class soal6 {
    public static void main(String[] args) {
        // Jarak dari koordinat 1 ke koordinat 2

        Scanner input = new Scanner (System.in);

        int koorX1 = input.nextInt();
        int koorY1 = input.nextInt();
        int koorX2 = input.nextInt();
        int koorY2 = input.nextInt();
        System.out.println("("+koorX1+","+koorY1+")"+" "+"("+koorX2+","+koorY2+")");

        int hasil = (koorX1 - koorX2) + (koorY1 - koorY2);

        if (hasil < 0) {
            System.out.println(hasil * -1);
        } else {
            System.out.println(hasil);
        }
    }
}
