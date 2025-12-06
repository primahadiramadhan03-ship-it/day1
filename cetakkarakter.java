import java.util.Scanner;

public class cetakkarakter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char karakter;

        System.out.println("Program akan berakhir jika Anda mengetik 'x' atau 'X'.");
        
        do {
            System.out.print("Masukkan sebuah karakter: ");
            karakter = input.next().charAt(0); // ambil karakter pertama dari input

            if (karakter != 'x' && karakter != 'X') {
                System.out.println("Karakter yang Anda masukkan: " + karakter);
            }

        } while (karakter != 'x' && karakter != 'X');

        System.out.println("Program selesai. Anda telah mengetik '" + karakter + "'.");
        input.close();
    }
}

