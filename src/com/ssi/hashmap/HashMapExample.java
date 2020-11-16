package com.ssi.hashmap;

import java.util.HashMap;

public class HashMapExample {
    private int key;
    private String desc;
    private HashMap<String,Integer> exit;

    public HashMapExample(int key, String desc) {
        this.key = key;
        this.desc = desc;
        this.exit=new HashMap<>();
        exit.put("Q",0);
    }

    public void addExit(String directions,int room){
        exit.put(directions,room);
    }

    public HashMap<String,Integer> returnExit(){
        return new HashMap<>(exit);
    }
    public String getDesc() {
        return desc;
    }

    public int getKey() {
        return key;
    }
}
