import java.util.Scanner;

public class belajar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukkan aji: ");
		int aji = sc.nextInt();
		System.out.println("masukkan bima: ");
		int bima = sc.nextInt();
		System.out.println("masukkan cinta: ");
		int cinta = sc.nextInt();
		System.out.println("masukkan dandi:");
		int dandi = sc.nextInt();
		
		int x = aji+bima+cinta+dandi;
		
		System.out.println("Ratarata: "+x/4);
	}
}	