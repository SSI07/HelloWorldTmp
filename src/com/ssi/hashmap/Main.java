package com.ssi.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static Locations location=new Locations();

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

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
                if(directions.containsValue(i))
                    System.out.print(i+'\t');
            }
            System.out.println('\n');
            //sc.nextLine();
            dir=sc.nextLine().toUpperCase();

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
