package com.dailycode.Collectionss;

import java.util.*;

public class Compartatorr {
    public static void main(String[] args) {
//        Integer arr[]={1,2,545,23,67};
//        Arrays.sort(arr,(Integer a,Integer b)->b-a);
//        System.out.println(Arrays.toString(arr));

        Car[] cr=new Car[3];
        cr[0]=new Car("suv","petrol");
        cr[1]=new Car("sadan","disel");
        cr[2]=new Car("hirt","cng");
        //   Arrays.sort(cr);
        Arrays.sort(cr,(Car obj1,Car obj2)->obj2.carType.compareTo(obj1.carType));

        for(Car carr:cr){
            System.out.println(carr.carName+" "+carr.carType);
        }

        System.out.println();

        Arrays.sort(cr,(Car obj1,Car obj2)->obj1.carName.compareTo(obj2.carName));

        for(Car carr:cr){
            System.out.println(carr.carName+" "+carr.carType);
        }

        List<Car>carsList=new ArrayList<>();
        carsList.add(new Car("suv","petrol"));
        carsList.add(new Car("sadan","disel"));

        Collections.sort(carsList,new CarComparator());

     carsList.forEach((car -> System.out.println(car.carName+" "+car.carType)));

    }
}

class Car{
    String carName;
    String carType;

    Car(String carName,String carType){
        this.carName=carName;
        this.carType=carType;
    }
}

class CarComparator implements Comparator<Car>{
    @Override
    public int compare(Car c1,Car c2){
        return c2.carName.compareTo(c1.carName);
    }
}
