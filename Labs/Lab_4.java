import java.util.Scanner;
public class Lab_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Frist charatar day of the week : ");
        String day = in.nextLine();

        switch (day) {
            case "Sat":
                System.out.println(" It is Saturday");
                break;
            case "Mon":
                System.out.println("It is Monday");
                break;
            case "Tue":
                System.out.println("It is Tuesday");
                break;
            case "Wed":
                System.out.println("It is Wednesday");
                break;
            case "Thu":
                System.out.println("It is Thursday");
                break;
            case "Fri":
                System.out.println("It is Friday");
                break;
            case  "Sun" : 
            System.out.println("It is Sunday");
            break;

            default:
             System.out.println("invalid input");
        }

    }
}
