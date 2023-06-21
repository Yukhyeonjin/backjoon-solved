package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_13410 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= K; i++) {
            int temp = N * i;
            String s = String.valueOf(temp);
            StringBuilder sb = new StringBuilder();
            for(int j = s.length()-1; j >= 0; j--) {
                sb.append(s.charAt(j));
            }

            max = Math.max(max, Integer.parseInt(sb.toString()));
        }
        bw.write(max+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
