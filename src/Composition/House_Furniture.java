package Composition;

public class House_Furniture {
    private int tables;
    private int chairs;
    private Bed bed;

    public House_Furniture(int tables, int chairs, Bed bed) {
        this.tables = tables;
        this.chairs = chairs;
        this.bed = bed;
    }
    public Bed bed1(){
        return bed;
    }

    public void use() {
        System.out.println("Using Furniture now");
    }
    public Bed use_bed(){
        return bed;
    }
}
