package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_5576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int W[] = new int[10],
            K[] = new int[10];
        for(int i = 0; i < 10; i ++){
            W[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 10; i ++){
            K[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(W);
        Arrays.sort(K);
        bw.write((W[9]+W[8]+W[7]) + " " + (K[9]+K[8]+K[7]));


        bw.flush();
        br.close();
        bw.close();
    }
}
