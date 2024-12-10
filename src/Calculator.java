
import java.util.Scanner;
public class Calculator {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         float n1,n2;
         System.out.print("Enter the first number: ");
         n1 = scanner.nextFloat();
         System.out.print("Enter the second number: ");
         n2 = scanner.nextFloat();


        do{
            System.out.println("1-Addition (+)\n");
            System.out.println("2-Subtraction (-)\n");
            System.out.println("3-Multiplication (*)\n");
            System.out.println("4-Division (/)\n");
            System.out.println("5-Puissance\n");
            System.out.println("6-Racine\n");
            System.out.println("7-Factorielle\n");
            System.out.println("9-get out of the system\n");

            System.out.println("enter your choice");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1: System.out.print("Result :"+Addition(n1,n2));
                break;
                case 2: System.out.print("Result :"+Subtraction(n1,n2));
                break;
                case 3: System.out.print("Result :"+Multiplication(n1,n2));
                break;
                case 4:System.out.print("Result :"+Division(n1,n2));

                case 5: System.out.print("Result :"+Puissance(n1,n2));
                break;
                case 6:
                    System.out.print("Result :" +Racine(n1,n2);
                break;
                case 7: System.out.print("Result :"+Factorielle(n1));
                break;
                case 8:  System.out.print("Goodby !");
                break;
                        default: System.out.print("Invalide choice ! please try again");
            }



        }

     }
}
