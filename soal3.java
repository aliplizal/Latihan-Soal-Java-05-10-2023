import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        //CASTING

        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan masukan angka desimal yang diinginkan");

        double bilangan = input.nextDouble();
        int bilanganInt = (int) bilangan; // double menjadi integer 8
        double x = bilangan - bilanganInt;

        if (x < 0.5){ // jika belakang koma kurang dari 0.5 maka akan true
            System.out.println(bilanganInt);
        } else {
            System.out.println(bilanganInt + 1);
        }
    }
}
