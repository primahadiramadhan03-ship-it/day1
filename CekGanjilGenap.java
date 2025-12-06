import java.util.Scanner;

public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Cek apakah bilangan negatif
        if (bilangan < 0) {
            System.out.println("Bilangan negatif. Program dihentikan.");
            System.exit(0); // langsung keluar program
        }

        // Jika bilangan positif, tentukan genap/ganjil
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }

        input.close();
    }
}
