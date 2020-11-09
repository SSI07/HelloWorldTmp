package Encapsulation;

public class Main {
    public static void main(String args[]){
        Printer printer=new Printer(100,10,false);
        printer.getToner_level();
        printer.setPages_printed();
        printer.getToner_level();
    }
}
