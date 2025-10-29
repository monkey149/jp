public class Employee{
    int empID;
    String empName;
    double empSalary;

    Employee(){
        empID = 5821;
        empName = "Coolie";
        empSalary = 500;
    }

    Employee(int e, String n){
        this.empID = e;
        this.empName = n;
        empSalary = 500;
    }

    Employee(int e, String n, double s){
        this.empID = e;
        this.empName = n;
        this.empSalary = s;
    }

    void display(){
        System.out.println("ID: " + empID + ", Name: " + empName + ", Salary: " + empSalary);
    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee(145,"Suresh");
        Employee e3 = new Employee(9543,"Rajamouli",89009.23);
        Employee e4 = e3;

        e1.display();
        e2.display();
        e3.display();
        e4.display();

        Mathoperations mh = new Mathoperations();
        System.out.println(mh.multiply(8, 6));
        System.out.println(mh.multiply(8.65,4.25));
        System.out.println(mh.multiply(3, 4, 5));
    }
}
