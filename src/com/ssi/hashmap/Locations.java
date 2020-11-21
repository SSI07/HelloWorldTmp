package com.ssi.hashmap;

import java.io.*;
import java.util.*;

public class Locations extends HashMap<Integer, HashMapExample> {
    private static HashMap<Integer,HashMapExample> location=new HashMap<>();

    /*public static void main(String[] args) throws IOException {
        try(FileWriter fc=new FileWriter("location.txt");
            FileWriter dir=new FileWriter("direction.txt")){
            for (HashMapExample locations:location.values()){
                fc.write(locations.getKey()+","+locations.getDesc()+'\n');
                for(String direction:locations.returnExit().keySet()){
                    dir.write(locations.getKey()+","+direction+","+locations.returnExit().get(direction)+'\n');
                }
            }
        }
    }*/
    static {
        try(Scanner sc=new Scanner(new FileReader("location.txt"))) {
            //sc.useDelimiter(",");
            while (sc.hasNextLine()){
                String[] tmp_arr=sc.nextLine().split(",");
                int loc=Integer.parseInt(tmp_arr[0]);
                String desc=tmp_arr[1];
                location.put(loc,new HashMapExample(loc,desc));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try(BufferedReader sc=new BufferedReader(new FileReader("direction.txt"))){

            while (sc.readLine()!=null){
                String[] tmp_arr2=sc.readLine().split(",");
                int loc=Integer.parseInt(tmp_arr2[0]);
                String direction=tmp_arr2[1];
                int room= Integer.parseInt(tmp_arr2[2]);
                HashMapExample locations=location.get(loc);
                locations.addExit(direction,room);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        /*location.put(0,new HashMapExample(0,"Quit"));
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
*/
    }

    public Locations(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public Locations(int initialCapacity) {
        super(initialCapacity);
    }

    public Locations() {
        super();
    }

    public Locations(Map<? extends Integer, ? extends HashMapExample> m) {
        super(m);
    }

    @Override
    public int size() {
        return location.size();
    }

    @Override
    public boolean isEmpty() {
        return location.isEmpty();
    }

    @Override
    public HashMapExample get(Object key) {
        return location.get(key);
    }



    @Override
    public boolean containsKey(Object key) {
        return location.containsKey(key);
    }

    @Override
    public HashMapExample put(Integer key, HashMapExample value) {
        return location.put(key, value);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends HashMapExample> m) {
        location.putAll(m);
    }

    @Override
    public HashMapExample remove(Object key) {
        return location.remove(key);
    }

    @Override
    public void clear() {
        location.clear();
    }

    @Override
    public boolean containsValue(Object value) {
        return location.containsValue(value);
    }

    @Override
    public Set<Integer> keySet() {
        return location.keySet();
    }

    @Override
    public Collection<HashMapExample> values() {
        return location.values();
    }

    @Override
    public Set<Entry<Integer, HashMapExample>> entrySet() {
        return location.entrySet();
    }
}
