import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
    Scanner sc = new Scanner(System.in);
    int tempt = sc.nextInt();
    
    if (tempt >= 100){
        System.out.println("Boiling");
    }else if (tempt < 100){
        System.out.println("Not boiling");
    }else {
        System.out.println("Not Boiling");
    }
    
    }
}