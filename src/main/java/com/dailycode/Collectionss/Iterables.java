package com.dailycode.Collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterables {
    public static void main(String[] args) {
        List<Integer>li = new ArrayList<>();
        li.add(12);
        li.add(45);
        li.add(32);
        Iterator<Integer>iterator =li.iterator();
        while (iterator.hasNext()){
            int val=iterator.next();
            if(val==45){
                iterator.remove();
            }
        }
      for(int val:li){
          System.out.println(val);
      }
        System.out.println();
        li.forEach((Integer value)-> System.out.println(value));
    }
}
