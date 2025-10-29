package exp7;

public class CollegeCourse {
    String dept;
    int courseNumber;
    int credits;
    int fees;
    String course;
    
    CollegeCourse(String dept, int courseNumber, int credits, String course){
        this.dept = dept;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.course = course;
        fees = credits * 120;
    }

    void display(){
        System.out.println("Department: " + dept +", Course Number: " + courseNumber + ", Credits: " + credits + ", Fees: " + fees);
    }

}
