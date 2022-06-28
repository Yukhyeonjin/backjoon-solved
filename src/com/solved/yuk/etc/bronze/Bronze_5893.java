package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_5893 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N[] = br.readLine().split("");
        BigInteger num = new BigInteger("0");
        for(int i = 0; i < N.length; i++){
            if("1".equals(N[i])){
                num = num.add(new BigInteger("2").pow(N.length-(1+i)));
            }
        }
        num = num.multiply(new BigInteger("17"));
        String result = "";
        while (num != BigInteger.valueOf(0)){
            result += num.mod(BigInteger.valueOf(2));
            num = num.divide(BigInteger.valueOf(2));
        }
        bw.write(new StringBuilder(result).reverse().toString());


        bw.flush();
        bw.close();
    }
}
