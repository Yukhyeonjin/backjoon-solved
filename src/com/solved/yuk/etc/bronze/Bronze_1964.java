package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_1964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 : 5
        // 결과가 매번 3x + 1 만큼씩 계속 더해진다.
        int N = Integer.parseInt(br.readLine());
        BigInteger sum = new BigInteger("5"),
                   firstIndex = new BigInteger("3"),
                   secondIndex = new BigInteger("1"),
                   x = new BigInteger("1");
        if(N >= 1){
            for(int i = 2; i <= N; i ++){
                x = x.add(secondIndex);
                sum = sum.add(x.multiply(firstIndex)).add(secondIndex);
            }
        }
        bw.write(sum.mod(new BigInteger("45678")).toString());


        bw.flush();
        br.close();
        bw.close();
    }
}
