import java.util.*;
public class Lab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Fix decimal format error (use dot '.' instead of comma)
        in.useLocale(Locale.US); 
        System.out.println("Enter a number in pounds : ");
        double pound = in.nextDouble();
        double kilogram = pound* 0.454;
        System.out.println(pound+" pounds is "+kilogram);



    }
}
