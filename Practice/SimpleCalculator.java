import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String [] arges){
        Scanner in = new Scanner(System.in);
        int option = 0;
        int num1 =0;
       
        int num2 =0;
        do {
            System.out.println("Select form the options : ");
            System.out.println("1. sum two numbers  : ");
            System.out.println("2. subtract two numbers : ");
            System.out.println("3. divide two numbers : ");
            System.out.println("If you want to exit Enter 0 : ");
             option = in.nextInt();

        


            switch(option){
                case 1:
                    System.out.print("Enter The First Number: ");
                    num1 = in.nextInt();
                    System.out.print("Enter The Second Number: ");
                    num2 = in.nextInt();
                    System.out.println("Result: " + (num1 + num2));
                case 2 : 
                    System.out.print("Enter The First Number: ");
                    num1 = in.nextInt();
                    System.out.print("Enter The Second Number: ");
                    num2 = in.nextInt();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3 :
                    System.out.print("Enter The First Number: ");
                    num1 = in.nextInt();
                    System.out.print("Enter The Second Number: ");
                    num2 = in.nextInt();
                    System.out.println("Result: " + (num1 /num2));
                     break;
                 case 0 :
                      System.out.println("Thank you, good bye!");
                      break;
                
            }
            
          
        }while (option!=0);
       
       
    }
    
}