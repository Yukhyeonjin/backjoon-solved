package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        bw.flush();
        bw.close();
    }

    public static long sum(int[] a){
        long sum = 0;
        for(int i = 0; i < a.length; i ++){
            sum += a[i];
        }
        return sum;
    }
}
