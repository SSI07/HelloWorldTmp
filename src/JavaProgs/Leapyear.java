package JavaProgs;

public class Leapyear {
    public static  void main(String args[]){
        boolean l=isLeapYear(1800);
        System.out.println(l);
    }

    private static boolean isLeapYear(int year) {
        if(year>=1 && year<=9999){
            if(year%4==0)
            {
                if(year%100==0) {
                    if (year % 400 == 0)
                        return true;
                }
                else{
                    return true;
                }
            }

        }
            return  false;


    }
}
