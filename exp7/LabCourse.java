package exp7;

class LabCourse extends CollegeCourse{
    
    LabCourse(String dept, int courseNumber, int credits,String c){
        super(dept,courseNumber,credits,c);
        fees = fees + 50;
    }
       void display(){
        System.out.println("Department: " + dept +", Course Number: " + courseNumber + ", Credits: " + credits + ", Fees: " + fees);
    }
}
