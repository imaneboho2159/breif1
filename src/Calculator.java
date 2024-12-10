
import java.util.Scanner;



    static double Addition (double n1,double n2){
        return (n1 + n2);
}
    static double Subtraction (double n1,double n2){
        return (n1 - n2);
}
    static double Multiplication (double n1,double n2) {
        return (n1* n2);
}
    static double Division (double n1,double n2) {

        return(n1/n2);
    }
    static double Puissance (double n1 ,double exponent){
        return Math.pow(n1,exponent);

    }
    static double Racine (double n1){

        return Math.sqrt( n1);
    }

    static int Factorielle (int n1){
        if(n1==0){
            return 1;
        }
        else{
            int Result=1;
            for(int i=1;i<=n1;i++){
                Result = Result * (n1-1);
                n1--;
            }
            return Result;
        }
    }

    public class Calculator {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);




         double n1,n2, exponent;
         System.out.print("Enter the first number: ");
         n1 = scanner.nextDouble();
         System.out.print("Enter the second number: ");
         n2 = scanner.nextDouble();


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
                case 4:if(n2==0) {
                    System.out.println(" invalid number !Division by zero");
                }
                else {
                    System.out.print("Result :" + Division(n1, n2));
                }
                break;
                case 5: System.out.print("enter the exponent");
                    exponent = scanner.nextFloat();
                    System.out.print("Result :"+Puissance(n1,exponent));
                break;
                case 6:if(n1>=0){
                    System.out.print("Result :"+Racine(n1));
                }
                  else{
                      System.out.print("Invalid number! Cannot calculate square root of a negative number.");
                }
                break;
                case 7:if(n1< 0 || n1 % 1!=0){
                    System.out.println(" invalid number !");
                }
                else {
                    System.out.print("Result :" + Factorielle(n1));
                }
                break;
                case 8:  System.out.print("Goodby !");
                break;
                        default: System.out.print("Invalide choice ! please try again");
            }
        while(choice != 9);


        }
        scanner.close();
     }
}
