package JavaProgs;

public class Dogbarking {
    public static  void main(String args[]){
        boolean l=shouldWakeUp(true,-1);
        System.out.println(l);
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay>=0 && hourOfDay<=23){
            if(barking==true && (hourOfDay<8 || hourOfDay>22))
                return  true;
            else
                return  false;

        }
        else
        {
            return false;
        }
    }
}
