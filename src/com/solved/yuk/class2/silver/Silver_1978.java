package com.solved.yuk.class2.silver;

import java.io.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Silver_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        int count = N;
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            int number = Integer.parseInt(input[i]);
            if(number < 2) {
                count--;
                continue;
            }else if(number == 2) continue;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    count--;
                    break;
                }
            }
        }
        bw.write(Integer.toString(count));

        bw.flush();
        bw.close();
    }
}
