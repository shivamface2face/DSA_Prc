package com.dailycode.BasicLogic.Lavel2;

public class GradeAssigner {
    public static void main(String[] args) {
int num=89;
if(num>=85){
    System.out.println("grade is A");
} else if (num>=70 && num<85) {
    System.out.println("grade is B");
} else if (num>60 && num<70) {
    System.out.println("grade is c");
}else if(num>40 && num<60){
    System.out.println("grade is d");
}else {
    System.out.println("grade is f");
}
    }
}

