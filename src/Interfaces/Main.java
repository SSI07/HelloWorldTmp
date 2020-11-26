package Interfaces;

public class Main {
    public static void main(String[] args) {
        Players p=new Players();
        p.addList(new Game(1,"ssi"));
        p.addList(new Game(2,"irfan"));

        p.getList().forEach(System.out::println);
    }
}
