package com.company;
import java.util.HashMap;

public class HashMapExample {

    public void main(String[] args){
        HashMap hm = new HashMap<>();

        hm.put(1213, "fdafdas");
        hm.put(112121, "tttttttt");
        hm.put(33333, "ewewweee");
        hm.put(62232, "gggggggggg");
        hm.remove(62232);

        System.out.println(hm);
    }
}
