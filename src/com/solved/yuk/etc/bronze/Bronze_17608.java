package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), wall[] = new int[N];

        for(int i = 0; i < N; i ++){
            wall[i] = Integer.parseInt(br.readLine());
        }
        int max = 0, count = 0;
        for(int i = N-1; i >= 0; i --){
            if(wall[i] > max) {
                count++;
                max = wall[i];
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
