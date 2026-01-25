package com.dailycode.Collectionss;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Collectionss {
    public static void main(String[] args) {
        List<Integer>values=List.of(1,2,3,54,5,6,7,9);
        System.out.println(values.size());
        System.out.println(values.contains(Integer.valueOf(54)));

     values.remove(4);
        System.out.println("After removing index 4: " + values);

        System.out.println(Collections.max(values));

        Stack<Integer>st=new Stack<>();
        st.add(34);
        st.add(90);
        values.addAll(st);
        System.out.println("Stack: " + st);

        // Add all stack elements to list
        values.addAll(st);
        System.out.println("After adding stack: " + values);

        // Check if list contains all stack elements
        System.out.println("Contains all stack elements? " + values.containsAll(st));

    }
}
