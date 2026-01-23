package com.dailycode.BasicLogicPhase_3.Lavel5;

public class ElementFrequencyPrinter {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 5, 16, 3, 8, 12, 9};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Element | Frequency");
        System.out.println("--------|----------");
        for (int i = 0; i < arr.length ; i++) {
            if(visited[i]){
                continue;
            }
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"       "+ count);

        }
    }
}
