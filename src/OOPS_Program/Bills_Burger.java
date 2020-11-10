package OOPS_Program;

public class Bills_Burger {
    private String bread_roll_type;
    private String meat;
    private double total_price=0;
    private double base_price;
    private Topings toping;
    private String burger_type;

    public Bills_Burger(String bread_roll_type, String meat, double base_price,String burger_type,Topings toping) {
        this.bread_roll_type = bread_roll_type;
        this.meat = meat;
        this.toping = toping;
        this.base_price=base_price;
        this.burger_type= burger_type;
    }

    public Bills_Burger(String bread_roll_type, String meat, double base_price, String burger_type) {
        this(bread_roll_type,meat,base_price,burger_type,new Topings("no","no","no","no"));
    }

    public void getTotal_price(){
        total_price+=base_price;
        for(int i=0;i<4;i++){
            total_price+=toping.for_loop(i);
           }
        price_splitup();
       }
    public void price_splitup(){
        String[] arr={"Tomato","Lettuce","Carrot","Potato"};
        System.out.println("Base Price     : "+base_price);
        for(int i=0;i<4;i++){
            if(toping.for_loop(i)!=0.0){
                System.out.println(arr[i]+" toping : "+toping.for_loop(i));
            }
        }
        if(burger_type=="Normal Burger"){
            System.out.println("-----------------------------");
            System.out.println("Total Price = "+String.format("%.2f",total_price));
            System.out.println("------------------------------");

        }


    }
    public double Total_price(){
        return total_price;
    }


}
