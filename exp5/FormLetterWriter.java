package exp5;
import java.util.Scanner;
public class FormLetterWriter {
    
    static void displaySalutation(String lastName){
        System.out.println("Dear Mr./Ms. " + lastName);
        System.out.println("Thankyou for your recent order");
    }

    static void displaySalutation(String lastName, String firstName){
        System.out.println("Dear " +firstName +" "+ lastName);
        System.out.println("Thankyou for your recent order");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();
        displaySalutation(lastName);

        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        displaySalutation(lastName, firstName);
        sc.close();
    } 
}
