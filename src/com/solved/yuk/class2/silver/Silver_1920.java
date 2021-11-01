package com.solved.yuk.class2.silver;

import java.io.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Silver_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        String[] inputA = br.readLine().split(" ");
        Set<BigInteger> set = new HashSet<BigInteger>();
        for(int i = 0; i < N; i ++){
            set.add(new BigInteger(inputA[i]));
        }

        int M = Integer.parseInt(br.readLine());
        String[] inputB = br.readLine().split(" ");
        for(int i = 0; i < M; i ++){
            if(set.contains(new BigInteger(inputB[i]))) bw.write("1");
            else bw.write("0");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
