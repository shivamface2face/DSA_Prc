package com.dailycode.Collectionss;
import java.util.*;
public class Listss {
    public static void main(String[] args) {
        List<Integer>li=new ArrayList<>();
        li.add(89);
        li.add(56);
        li.add(12);
        li.add(1,90);

        List<Integer>li2=new ArrayList<>();
        li2.add(0,67);
        li2.add(1,34);
        li2.add(2,21);
        li.addAll(2,li2);
        li.forEach((Integer val)->System.out.print(val+" "));

        System.out.println();

        li.replaceAll((Integer val)->-1*val);
        li.forEach((Integer val)->System.out.print(val+" "));

        li.sort((Integer a,Integer b)-> a-b);
        System.out.println();
        li.forEach((Integer val)->System.out.print(val+" "));

        li.set(2,22);
        System.out.println("after set");
        li.forEach((Integer val)->System.out.print(val+" "));

        System.out.println();
        li.remove(2);
        li.forEach((Integer val)->System.out.print(val+" "));
        System.out.println();
        System.out.println(li.indexOf(-12));

//        Previous travel


        li.forEach((Integer val)->System.out.print(val+" "));

        ListIterator<Integer> listItr = li2.listIterator(li2.size());

        while(listItr.hasPrevious()){
            int previousVal=listItr.previous();
            System.out.println(previousVal+" "+listItr.nextIndex()+" "+listItr.previousIndex());
        }

        ListIterator<Integer> listItrFor = li2.listIterator();
        while(listItrFor.hasNext()){
            int val=listItrFor.next();
            System.out.println(val+" "+listItrFor.nextIndex()+" "+listItrFor.previousIndex());
            if(val==21){
                listItrFor.add(9);
            }
        }
        li2.forEach((Integer val)->System.out.println(val));

        List<Integer>subList=li.subList(2,4);
        subList.forEach((Integer val)->System.out.print(val));
    }
}
