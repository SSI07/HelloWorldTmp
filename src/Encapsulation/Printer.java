package Encapsulation;

public class Printer {
    private int toner_level=10;
    private int pages_printed;
    private boolean is_duplex;

    public Printer(int toner_level, int pages_printed, boolean is_duplex) {
        this.toner_level+= toner_level;
        this.pages_printed = pages_printed;
        this.is_duplex = is_duplex;
    }

    public int getPages_printed() {
        return pages_printed;
    }

    public void setPages_printed(){
        int j=1;
        if(pages_printed>1)
            if(is_duplex==true) {
                pages_printed /= 2;
                j = 2;
            }
            for(int i=1;i<=pages_printed;i++) {
                System.out.println("Printing page " + i );
                toner_level-=j;
            }
    }
    public void getToner_level(){
        System.out.println("The Toner Level is: "+toner_level);
    }
}
