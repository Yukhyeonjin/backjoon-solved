package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_15818 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        long N = Long.parseLong(input[0]);
        BigInteger M = new BigInteger(String.valueOf(input[1]));
        BigInteger sum = new BigInteger("1");
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            sum = sum.multiply(new BigInteger(input[i]));
        }
        bw.write(sum.mod(M).toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

