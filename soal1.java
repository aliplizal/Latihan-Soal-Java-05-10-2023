import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        //POSTIF NEGATIF

        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan masukan angka yang diinginkan untuk mengetahui positif atau negatif bilangan tersebut");
        
        int angka = input.nextInt();

        if (angka >= 0) {
            System.out.println(angka + " adalah bilangan Positif");
        } else {
            System.out.println(angka + " adalah bilangan Negatif");
        }
    }
}
