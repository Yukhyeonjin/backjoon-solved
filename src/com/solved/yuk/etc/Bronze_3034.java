package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            W = Integer.parseInt(input[1]),
            K = Integer.parseInt(input[2]);
        double D = Math.sqrt(Math.pow(W,2) + Math.pow(K,2));
        for(int i = 0; i < N; i ++){
            int num = Integer.parseInt(br.readLine());
            if(num <= D) bw.write("DA\n");
            else bw.write("NE\n");
        }

        bw.flush();
        bw.close();
    }
}
