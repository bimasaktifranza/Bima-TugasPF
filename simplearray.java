import java.util.Scanner;

public class simplearray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] data = {'a','b','c','d','e','f',};
		System.out.println("inputkan data 0");
		int a = sc.nextInt();
		System.out.println("inputkan data 1");
		int b = sc.nextInt();
		System.out.println("inputkan data 2");
		int c = sc.nextInt();
		System.out.println("inputkan data 3");
		int d = sc.nextInt();
		System.out.println("inputkan data 4");
		int e = sc.nextInt();
		System.out.println("inputkan data 5");
		int f = sc.nextInt();
		
		System.out.println("data 0: "+2);
		System.out.println("data 1: "+3);
		System.out.println("data 2: "+10);
		System.out.println("data 3: "+9);
		System.out.println("data 4: "+19);
		System.out.println("data 5: "+4);
		
		int x = a+b+c+d+e+f;
		System.out.println("Total penjumlahan: "+x);
		System.out.println("Ratarata: "+x/6);
	}
}	