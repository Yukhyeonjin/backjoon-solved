package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(N == 1 || N == 0) bw.write("1");
        else {
            long sum = factorial(N);
            bw.write(sum+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static long factorial(long n){
        if(n == 2) return n;
        else return n * factorial(n-1);
    }
}
