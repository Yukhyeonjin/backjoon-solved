package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Bronze_11104 {

    public static void solution(){
        Scanner sc = new Scanner(System.in); 
       int n=sc.nextInt();
       Long result=(long) 0;       
       Long cnt =(long) 1;
       
       for(int i=0;i<n;i++) {
               String [] arr =sc.next().split("");
                           
               for(int j=23;j>=0;j--) {
                   result+= Integer.parseInt(arr[j])*cnt;
                           cnt*=2;
               }
               System.out.println(result);
               cnt=(long)1;
               result=(long)0;
       }
    }

    public static void main(String[] args){
        solution();
    }
}