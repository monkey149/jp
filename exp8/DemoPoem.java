package exp8;

public class DemoPoem {
    public static void main(){
        Poem p1 = new Poem("Crow",6);
        Poem p2 = new Limerick("Gafuur");
        Poem p3 = new Haiku("Babuchak");
        Poem p4 = new Couplet("Fafda");
        System.out.println("Name: " + p1.getName() +", Lines: "+ p1.getLine());
        System.out.println("Name: " + p2.getName() +", Lines: " +  p2.getLine());
        System.out.println("Name: " + p3.getName() +", Lines: " + p3.getLine());
        System.out.println("Name: " + p4.getName() +", Lines: "  + p4.getLine());
    }
}
