import java.util.Scanner;

public class GG{
	
	public static void main(String [] koko){
		Scanner in = new Scanner(System.in);
		System.out.print("Jumlah data : ");
		
		int jumlahdata = in.nextInt();
		int [] data = new int [jumlahdata];
		System.out.println("inputkan data berikut " );
		
		for (int a = 0; a < jumlahdata; a++){
			System.out.print("Data ke- " + a + ": ");
			data [a] = in.nextInt();
		}
		System.out.println("Menampilkan data ");
		
		for (int a = 0; a < jumlahdata ; a++){
			if (data[a] % 2 == 0){
				System.out.println(data[a] + " --> Genap");
			}else{
				System.out.println(data[a] + " --> Ganjil");
			}
		}
		
		int total = 0;
		for (int a = 0; a < jumlahdata; a++){
			total = total + data[a];
		}	
		System.out.println(total);
		double ratarata = total/jumlahdata;
		System.out.println(ratarata);
	}
	
	
}	
