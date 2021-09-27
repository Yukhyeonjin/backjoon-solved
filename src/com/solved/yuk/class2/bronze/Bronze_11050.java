package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_11050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            K = Integer.parseInt(input[1]);

        bw.write(Integer.toString(factorial(N) / (factorial(N-K) * factorial(K)) ));

        bw.flush();
        bw.close();
    }

    public static int factorial(int n){
        if(n != 0) {
            return n * factorial(n-1);
        } else return 1;
    }
}
