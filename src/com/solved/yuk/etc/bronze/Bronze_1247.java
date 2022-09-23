package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < 3; i ++){
            int N = Integer.parseInt(br.readLine());
            BigInteger S = new BigInteger("0");
            for(int j = 0; j < N; j ++){
                BigInteger number = new BigInteger(br.readLine());
                S = S.add(number);
            }
            if(S.compareTo(new BigInteger("0")) == 0){
                bw.write("0\n");
            }
            else if (S.compareTo(new BigInteger("0")) == 1){
                bw.write("+\n");
            }
            else {
                bw.write("-\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
