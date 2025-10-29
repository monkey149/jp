package exp2;

public class Student{
    int id;
    int creditHours;
    double points;
    double gpa;
        Student(){
            id = 5821;
            creditHours = 3;
            points = 12;
            gpa = 4;
        }

        void studentInfo(int i, int c, double p){
            this.id = i;
            this.creditHours = c;
            this.points = p;
        }

        void gradePointAverage(){
            gpa = points/creditHours;
        }

        void display(){
            System.out.println("ID: " + id + ", Points: " + points + ", Credit Hours: " + creditHours + ", GPA: " + gpa);
        }
}
