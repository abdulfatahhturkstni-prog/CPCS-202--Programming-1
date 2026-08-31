import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long f=1;
        int j=1;
       while (j!=0) { 
         f =1;
        System.out.println("Enter Number to get the factorial : ");
        int num = in.nextInt();
        
            if(num<0){
                System.out.println("Factorial is not defined for negative numbers.");
        }
        else{
            for(int i=1 ; i<=num;i++){
            f *=i;
        }
        System.out.println("Factorial : "+f);
        }

        
        System.out.println("If you want to exit Enter (0), or any other number to continue: ");
        j=in.nextInt();
    }
}
}
