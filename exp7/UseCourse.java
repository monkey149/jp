package exp7;

import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your department: ");
        String dept = sc.nextLine();
        System.out.println("Enter your Course Number: ");
        int courseNumber = sc.nextInt();
        System.out.println("Enter your credits: ");
        int credits = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your course: ");
        String course = sc.nextLine();

        CollegeCourse cc;
        if (course.equals("PHY") | course.equals("CHEM") | course.equals("BIO")) {
            cc = new LabCourse(dept, courseNumber, credits, course);
        } else {
            cc = new CollegeCourse(dept, courseNumber, credits, course);
        }
        cc.display();
        sc.close();
    }
}
