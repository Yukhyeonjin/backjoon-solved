package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27960 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 2 4 8 16 32 64 128 256
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]);
        int C = 0;
        int score = 512;
        while (score > 0) {
            int cnt = 0;

            if (A>=score) {
                cnt++;
                A-=score;
            }
            if (B>=score) {
                cnt++;
                B-=score;
            }
            if (cnt == 1)
                C += score;

            score>>=1;
        }
        bw.write(C+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

