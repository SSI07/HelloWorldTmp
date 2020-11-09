package JavaProgs;

public class MinutesSeconds {
    public static void main(String args[]){
        String l=getDurationString(3945);
        String l1=getDurationString(65,45);
        System.out.println(l);
        System.out.println(l1);
    }

    public static String getDurationString(double sec) {
        int mm=(int)sec/60;
        int ss=(int)sec%60;
        return getDurationString(mm,ss);
    }

    public static String getDurationString(double mins, double sec){
        if(mins>=0 || (sec>=0 && sec<=59)){
            int hh=(int)mins/60;
            int mm=(int)mins%60;
            return  hh+"hh "+mm+"mm "+(int)sec+"ss ";


        }
        return "Invalid value";
    }
}
