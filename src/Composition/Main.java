package Composition;

public class Main {
    public static void main(String args[]){
        House house=new House("SSI",2,new House_Furniture(1,4,new Bed(1,2,3)));
        house.getFurniture();
        house.furniture().use_bed().bed();

    }
}
