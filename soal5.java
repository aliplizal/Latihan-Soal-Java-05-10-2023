import java.util.Collection;
import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        // MENGURUTKAN TIGA BILANGAN DARI YANG TERKECIL

        Scanner input = new Scanner (System.in);

        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        int angka3 = input.nextInt();

        if (angka1<=angka2&&angka2<=angka3) {
            System.out.println(angka1+" "+angka2+" "+angka3);
        } else if (angka1<=angka3&&angka3<=angka2) {
            System.out.println(angka1+" "+angka3+" "+angka2);
        } else if (angka2<=angka1&&angka1<=angka3) {
            System.out.println(angka2+" "+angka1+" "+angka3);
        } else if (angka2<=angka3&&angka3<=angka1) {
             System.out.println(angka2+" "+angka3+" "+angka1);
        } else if (angka3<=angka1&&angka1<=angka2) {
            System.out.println(angka3+" "+angka1+" "+angka2);
        } else if (angka3<=angka2&&angka2<=angka1) {
             System.out.println(angka3+" "+angka2+" "+angka1);
        }
    }
}
