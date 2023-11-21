import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choise;
        if (sc.hasNextInt()) {
            choise = sc.nextInt();
        if(choise >=0 && choise <
menu.length) {
             String selectedDrink =
menu[choise];

System.out.println(selectedDrink);
           }else {
           System.out.println("Invalid");
           }
         }else{ 
           System.out.println("Invalid input.Please enter a valid integer");
           }
           sc.close();
    }

}