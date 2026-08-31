import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sumEven =0;
        int sumodd =0;
       for(int i =1 ; i<=10;i++){
        System.out.println("Enter The number # "+i);
        num = in.nextInt(); 
          if(num%2==0){
            sumEven+=num;
          }
          else{
            sumodd+=num;
          }
       }
       System.out.println("The sum of even numbers is "+sumEven);
       System.out.println("The sum of odd numbers is "+sumodd);

}
}