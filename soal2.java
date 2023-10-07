import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        //GENAP GANJIL

        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan masukan angka yang diinginkan untuk mengetahui genap atau ganjil bilangan tersebut");
        
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + "adalah bilangan genap");
        } else {
            System.out.println(bilangan + "adalah bilangan ganjil");
        }
    }
}
