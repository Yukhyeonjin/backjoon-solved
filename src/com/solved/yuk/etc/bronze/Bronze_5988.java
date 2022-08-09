package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            BigInteger K = new BigInteger(br.readLine());
            bw.write((K.mod(new BigInteger("2")).equals(new BigInteger("1")) ? "odd" : "even") + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
