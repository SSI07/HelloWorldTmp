package Composition;

public class House {
    private String name;
    private int floors;
    private House_Furniture furniture;

    public House(String name, int floors, House_Furniture furniture) {
        this.name = name;
        this.floors = floors;
        this.furniture = furniture;
    }

    public void getFurniture() {
        furniture.use();
    }
    public House_Furniture furniture(){

        return furniture;
    }


}
