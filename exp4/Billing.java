

public class Billing {
    
    double ComputeBill(double price){
        double total = price;
        return (total*0.08) + total;
    }

    double ComputeBill(double price, int quantity){
        double total = price * quantity;
        return (total*0.08) + total;
    }

    double ComputeBill(double price, int quantity, double coupon){
        double total = (price*quantity) - coupon;
        return (total*0.08) + total;
    }

    public static void main(String[] args){
        Billing bg = new Billing();
        System.out.println(bg.ComputeBill(89));
        System.out.println(bg.ComputeBill(85.22, 6));
        System.out.println(bg.ComputeBill(96.36, 8, 22.26));
    }
}
