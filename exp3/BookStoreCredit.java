package exp3;

import java.util.Scanner;

public class BookStoreCredit {

    static void displayMessage(String name, double gpa){

        double credits = 10 * gpa;
        System.out.println("Name: " + name + ", GPA: " + gpa + ", Credits: " + credits + "$");

    }
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your grade point average: ");
        double gpa = sc.nextDouble();

        displayMessage(name, gpa);

        sc.close();
    }
}
