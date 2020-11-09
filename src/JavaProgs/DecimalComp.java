package JavaProgs;

public class DecimalComp {
    public static  void main(String args[]){
        boolean l=areEqualByThreeDecimalPlaces(-3.1756,-3.1757);
        System.out.println(l);
    }

    public static boolean areEqualByThreeDecimalPlaces(double v, double v1) {
        v*=1000;
        v1*=1000;
        return (int)v==(int)v1?true:false;
    }
}
