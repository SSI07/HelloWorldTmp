package OOPS_Program;

public class Topings {
    private String tomato;
    private  String lettuce;
    private String carrot;
    private String potato;
    private double ptomato=20;
    private double plettuce=10;
    private double pcarrot=40;
    private double ppotato=30;

    public Topings(String  tomato, String lettuce, String carrot,String potato) {
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.carrot = carrot;
        this.potato = potato;
    }

    public String getTomato() {
        return tomato;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getCarrot() {
        return carrot;
    }

    public String getPotato() {
        return potato;
    }

    public double getPtomato() {
        return ptomato;
    }

    public double getPlettuce() {
        return plettuce;
    }

    public double getPcarrot() {
        return pcarrot;
    }

    public double getPpotato() {
        return ppotato;
    }
    public double for_loop(int value){
        if(value==0 && getTomato()=="yes") {
            return getPtomato();
        }
        else if(value==1 && getLettuce()=="yes") {
            return getPlettuce();
        }
        else if(value==2 && getCarrot()=="yes") {
            return getPcarrot();
        }
        else if(value==3 && getPotato()=="yes") {
            return getPpotato();
        }
        return 0.0;
    }
}
