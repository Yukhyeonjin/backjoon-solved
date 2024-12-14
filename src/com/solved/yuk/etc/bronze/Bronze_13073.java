package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13073 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i ++){
            int N = Integer.parseInt(br.readLine());
            int sum1=0, sum2=0, sum3=0;
            int odd = 1, even = 2;
            for (int j = 1; j <= N; j++){
                sum1+=j;
                sum2+=odd; odd+=2;
                sum3+=even; even +=2;
            }
            bw.write(sum1 + " " + sum2 + " " + sum3 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}