import java.util.Scanner; 

public class SquareTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input an integer");
        int num = sc.nextInt();

        boolean isPerfectSquare;
        if(num >= 0) {
       // truncate sqrt(num) to an integer
        // eg, sqrt(15)=>3, sqrt(16)=>4, sqrt(17)=>4
       int result = (int) Math.sqrt(num);
       // square the result to see if get original number
       result = result * result;
            if (result == num) {
            isPerfectSquare = true;
            }
            else {
            isPerfectSquare = false;
            }
       // alternately you could write:
       // isPerfectSquare = (result == num);
            }
        else { // negative numbers are not perfect squares
        isPerfectSquare = false;
        }
        System.out.println(isPerfectSquare);
    } 
}
