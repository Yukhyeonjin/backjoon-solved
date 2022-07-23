package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger N = new BigInteger(br.readLine()), num = N.add(new BigInteger("1")), sum = new BigInteger("0"),
        plusNum = num;
        while (true){
            if(num.divide(N).compareTo(N) == 1) break;
            else if(num.divide(N).equals(num.mod(N))){
                sum = sum.add(num);
            }
            num = num.add(plusNum);
        }
        bw.write(sum.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}