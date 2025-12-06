import java.util.Scanner;

public class aritmatika {
  public static void main(String[] cihuy) {
        Scanner scanner = new Scanner(System.in);  
        int a;
        int n;
        int b;
        int suku;
        int i=1;
        int Un=0;
        System.out.print("Input bilangan ke-a : ");
        a = scanner.nextInt();
        System.out.print("Input bilangan ke N : ");
        n = scanner.nextInt();
        System.out.print("Input beda (b) : ");
        b = scanner.nextInt();

         while (i <= n) {
            suku = a + (i - 1) * b;   // rumus suku ke-i
            System.out.println(suku + " ");
            Un =Un + suku;
            i++;
        }
         System.out.print("mak jumlah suku ke N dari UN adalah : "+Un);

}
}
