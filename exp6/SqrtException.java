package exp6;
import java.util.Scanner;
public class SqrtException{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        try{
            if(num < 0) throw new ArithmeticException("Negative");
            System.out.println("Sqrt: " + Math.sqrt(num));
        } catch (ArithmeticException ex){
            System.out.println("Error: " + ex.getMessage());
        }

    }
}
