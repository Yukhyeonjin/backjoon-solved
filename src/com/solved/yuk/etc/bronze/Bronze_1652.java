package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), room[][] = new int[N][N];
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split("");
            for(int j = 0; j < N; j ++){
                if(".".equals(input[j])){
                    room[i][j] = 0;
                }else {
                    room[i][j] = 1;
                }
            }
        }

        int horizon = 0, vertical = 0;
        for(int i = 0; i < N; i ++){
            int hCount = 0, vCount = 0;
            for(int j = 0; j < N; j ++){
                if(room[i][j] == 0) hCount ++;
                if(room[i][j] == 1 || j == N-1){
                    if(hCount >= 2) horizon++;
                    hCount = 0;
                }

                if(room[j][i] == 0) vCount++;
                if(room[j][i] == 1 || j == N-1){
                    if(vCount >= 2) vertical++;
                    vCount = 0;
                }
            }
        }
        bw.write(horizon + " " + vertical);


        bw.flush();
        br.close();
        bw.close();
    }
}
