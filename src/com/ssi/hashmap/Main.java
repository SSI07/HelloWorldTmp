package com.ssi.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer,HashMapExample> location=new HashMap<>();

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        location.put(0,new HashMapExample(0,"Quit"));
        location.put(10,new HashMapExample(10,"You are out of your home"));
        location.put(1,new HashMapExample(1,"You are in the kitchen"));
        location.put(2,new HashMapExample(2,"You are in the Hall"));
        location.put(3,new HashMapExample(3,"You are in the Bedroom"));
        location.put(4,new HashMapExample(4,"You are in Dining room"));

        location.get(10).addExit("W",2);

        location.get(2).addExit("N",1);
        location.get(2).addExit("S",3);

        location.get(1).addExit("W",4);
        location.get(1).addExit("S",2);

        location.get(3).addExit("N",2);

        location.get(4).addExit("E",1);

        HashMap<String,String> directions=new HashMap<>();
        directions.put("QUIT","Q");
        directions.put("NORTH","N");
        directions.put("SOUTH","S");
        directions.put("EAST","E");
        directions.put("WEST","W");

        int loc=10;
        String dir="";
        while (true){

            if(loc==0){
                System.out.println("Quiting....");
               break;
            }
            HashMap<String,Integer> exit=location.get(loc).returnExit();

            System.out.println(location.get(loc).getDesc());

            System.out.println("Available directions are:");
            for (String i: exit.keySet() ) {
                System.out.print(i+'\t');
            }
            System.out.println('\n');
            //sc.nextLine();
            String[] direction=sc.nextLine().toUpperCase().split(" ");
            for (String s:direction) {
                if(directions.containsKey(s))
                    dir=directions.get(s);

            }
            if(!exit.containsKey(dir)){
                System.out.println("Invalid Direction");

            }
            else {
                loc = exit.get(dir);
            }

        }
        sc.close();
       }
}
