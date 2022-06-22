package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_24309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine()),
                   b = new BigInteger(br.readLine()),
                   c = new BigInteger(br.readLine());

        bw.write(b.subtract(c).divide(a)+"");

        bw.flush();
        bw.close();
    }
}
