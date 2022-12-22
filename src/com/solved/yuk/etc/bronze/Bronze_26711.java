package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_26711 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(br.readLine()),
                   B = new BigInteger(br.readLine());
        bw.write(A.add(B).toString()+"");

        bw.flush();
        bw.close();
        br.close();
    }

}