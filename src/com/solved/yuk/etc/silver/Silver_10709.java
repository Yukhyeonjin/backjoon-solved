package com.solved.yuk.etc.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Silver_10709 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int[][] arr = new int[H][W];
        for(int i = 0; i < H; i ++){
            input = br.readLine().split("");
            for(int j = 0; j < W; j ++){
                if("c".equals(input[j]))arr[i][j] = 0;
                else arr[i][j] = -2;
            }
        }
        int recentCloud;
        for(int i = 0; i < H; i ++){
            recentCloud = -1;
            for(int j = 0; j < W; j ++){
                if(arr[i][j] == 0) recentCloud = j;
                else if(arr[i][j] == -2 && recentCloud != -1) {
                    arr[i][j] = j-recentCloud;
                }
                else arr[i][j] = -1;
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
