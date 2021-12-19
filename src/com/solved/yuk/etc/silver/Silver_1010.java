package com.solved.yuk.etc.silver;

import java.io.*;
import java.math.BigInteger;

public class Silver_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]),
                M = Integer.parseInt(input[1]);
            // nCr = n!/(n-r)!r!
            if (N == M) bw.write("1\n");
            else {
                BigInteger output = factorial(M).divide((factorial(M - N).multiply(factorial(N))));
                bw.write(output + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static BigInteger factorial(int n) {
        if (n == 1) return new BigInteger("1");
        return new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
    }
}
