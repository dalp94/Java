import java.util.Scanner;

public class FooCorporation {
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the wager employee");
        double wager = input.nextDouble();

        System.out.println("Enter the hours employee");
        double hour = input.nextDouble();
        if (wager > 40) {
            System.out.println("Your total salary is: " + (wager + 1.5*wager*(hour-40)));
        } else {
            System.out.println("your total salary is: " + (wager*hour));
        }
            
        //double total = wager*hour; 
        //System.out.println("the total wager is: " + total);

        }
    
    
}
