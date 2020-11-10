package OOPS_Program;

public class Healthy_Burger extends Bills_Burger{
    private String dry_bread;
    private String dry_bread_roll;
    private String item1;
    private String item2;
    private double pitem1=30;
    private double pitem2=40;
    private double pdrybread=50;
    public Healthy_Burger(String bread_roll_type, String meat, double base_price, String dry_bread, String burger_type, String item1, String item2) {

        super(bread_roll_type, meat,base_price,burger_type);
        this.dry_bread=dry_bread;
        this.item1=item1;
        this.item2=item2;
    }
    public void get_price(){
        getTotal_price();
        double total_price=Total_price();
        total_price+=pitem1+pitem2+pdrybread;
        System.out.println(dry_bread+" : "+pdrybread);
        System.out.println(item1+" : "+pitem1);
        System.out.println(item2+" : "+pitem2);
        System.out.println("-----------------------------");
        System.out.println("Total Price = "+String.format("%.2f",total_price));
        System.out.println("------------------------------");


    }

}
