import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        // MENGURUTKAN DUA BILANGAN DARI YANG TERKECIL

        Scanner input = new Scanner (System.in);

        int angka1 = input.nextInt();
        int angka2 = input.nextInt();

        if (angka1 < angka2) {
            System.out.print(angka1+" "+angka2);
        } else {
            System.out.print(angka2+" "+angka1);

        }
    }
}
