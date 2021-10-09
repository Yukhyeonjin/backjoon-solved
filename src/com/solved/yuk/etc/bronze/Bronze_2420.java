package com.solved.yuk.etc.bronze;


import java.io.*;
import java.math.BigInteger;

public class Bronze_2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        BigInteger N = new BigInteger(input[0]);
        BigInteger M = new BigInteger(input[1]);
        bw.write(N.subtract(M).abs().toString());

        bw.flush();
        bw.close();

    }
}
