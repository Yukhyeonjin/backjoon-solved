package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_2748 {
    static BigInteger arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new BigInteger[n+1];
        if(n == 0){
            bw.write("0");
        }else if(n == 1){
            bw.write("1");
        }else {
            fibonacci(n);
            bw.write(arr[n].toString());
        }

        bw.flush();
        bw.close();
    }

    public static void fibonacci(int n){
        arr[0] = new BigInteger("0");
        arr[1] = new BigInteger("1");
        for(int i = 2; i <= n; i ++){
            arr[i] = arr[i-1].add(arr[i-2]);
        }
    }
}
