package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        BigInteger A = new BigInteger(input[0]),
                   B = new BigInteger(input[1]);
        bw.write((A.add(B)).multiply(A.subtract(B)).toString());

        bw.flush();
        bw.close();

    }
}
