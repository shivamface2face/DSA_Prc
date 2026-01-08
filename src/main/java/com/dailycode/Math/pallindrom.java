package com.dailycode.Math;

public class pallindrom {
    public static void main(String[] args) {
        int n=121;
        int rev=0;
        int tem=n;
        while (tem!=0){
            int ld=tem % 10;
            rev=rev*10+ld;
            tem=tem/10;
        }

if(rev==n){
    System.out.println("pallindrom");
}else{
    System.out.println("not a pallindrom");
}


// for string








        
 String srt="madam";
int left=0;
int right=srt.length()-1;
while (left<right){
    if (srt.charAt(left)!= srt.charAt(right)){
        System.out.println("not a pallindrom");
        return;
    }
    left++;
    right--;
}




    }
}
