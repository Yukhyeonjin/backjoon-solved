package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()), sum = 0;
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < N; j ++){
                sum += Integer.parseInt(input[j]);
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        bw.close();
    }
}
