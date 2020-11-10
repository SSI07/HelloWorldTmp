package OOPS_Program;

public class Main {
    public static void main(String args[]){
        Bills_Burger burger=new Bills_Burger("bread","chicken",200.00,"Normal Burger",new Topings("yes","yes","yes","yes"));
        burger.getTotal_price();
        Healthy_Burger burger1=new Healthy_Burger("bread","chicken",200.00,"dry bread","Healthy Burger","Spinach","Olive");
        burger1.get_price();
    }
}
