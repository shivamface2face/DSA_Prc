package com.dailycode.Classes;

public class AbstarctClassExmp {
    public static void main(String[] args) {
        Audi a = new Audi(10);
        a.pressBreak();
        a.pressClutch();
        a.pressDouble();
    }
}

abstract class Car {
    int val;
    Car(int val){
        this.val=val;
    }
    public abstract void pressBreak();
    public abstract void pressClutch();
    public int getNumberOfWheel(){
        return 4;
    }

}

abstract class Motor extends Car{
    Motor(int val){
        super(val);
    }

    public abstract void pressDouble();

}

class Audi extends Motor{
    Audi(int val){
        super(val);
    }
    @Override
    public void pressDouble(){
        System.out.println("press double");
    }
    @Override
    public void pressClutch(){
        System.out.println("press cluthch");
    }
    @Override
    public void pressBreak() {
        System.out.println("press break");
    }
}


