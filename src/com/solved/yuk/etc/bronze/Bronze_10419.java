package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            int d = Integer.parseInt(br.readLine());
            int max = 1;
            while(max + (max * max) <= d) {
                max++;
            }
            bw.write((max - 1)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
