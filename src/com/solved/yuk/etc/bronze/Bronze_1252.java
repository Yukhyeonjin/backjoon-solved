package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_1252 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "),
               a = input[0], b = input[1];

        BigInteger aInteger = new BigInteger(a, 2);
        BigInteger bInteger = new BigInteger(b, 2);

        BigInteger sum = aInteger.add(bInteger);

        String result = sum.toString(2);

        bw.write(result);


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

