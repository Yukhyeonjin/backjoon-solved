package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int Y = 0, M = 0;
        for(int i = 0; i < N; i ++){
            int sec = Integer.parseInt(input[i]);
            Y += ((sec/30)+1)*10;
            M += ((sec/60)+1)*15;
        }
        if(Y > M) bw.write("M " + M);
        else if(Y < M) bw.write("Y " + Y);
        else bw.write("Y M " + Y);

        bw.flush();
        bw.close();
    }
}
