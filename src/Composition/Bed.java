package Composition;

public class Bed {
    private int length;
    private  int width;
    private  int height;

    public Bed(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void bed(){
        System.out.println("Using bed now");
    }
}
