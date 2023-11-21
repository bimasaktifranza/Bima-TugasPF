
import java.util.Scanner;
public class bion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        int[] angka = new int[jumlahAngka];
        int totalGanjil = 0;
        int totalGenap = 0;
        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i) + ": ");
            angka[i] = scanner.nextInt();

            if (angka[i] % 2 == 0) {
                System.out.println("Angka ini = GENAP");
                totalGenap += angka[i];
                jumlahGenap++;
                
            } else {
                System.out.println("Angka ini = GANJIL");
                totalGanjil += angka[i];
                jumlahGanjil++;
                
            }
            
         }
        
        System.out.println("Hasil Penjumlahan Ganjil: " + totalGanjil);
        System.out.println("Hasil Penjumlahan Genap: " + totalGenap);
                
        System.out.println("Jumlah Ganjil: " + jumlahGanjil);
        System.out.println("Jumlah Genap: " + jumlahGenap);
        
        double rataRataGanjil = (double) totalGanjil / jumlahGanjil;
        double rataRataGenap = (double) totalGenap / jumlahGenap;
        
        System.out.println("Rata-rata angka ganjil: " + rataRataGanjil);
        System.out.println("Rata-rata angka genap: " + rataRataGenap);
        
        scanner.close();
    }
}