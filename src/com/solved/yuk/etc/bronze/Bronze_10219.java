package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10219 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T != 0) {
            String input[] = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]), W = Integer.parseInt(input[1]);
            String meat[][] = new String[H][W];
            for(int i = 0;i < H; i ++){
                input = br.readLine().split("");
                for(int j = 0; j < W; j ++){
                    meat[i][j] = input[j];
                }
            }
            for(int i = 0;i < H; i ++){
                for(int j = W-1; j >= 0; j --){
                    bw.write(meat[i][j]);
                }
                bw.newLine();
            }
            T--;
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}