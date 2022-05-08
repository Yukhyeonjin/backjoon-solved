package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2167 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String NM[] = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]),
            M = Integer.parseInt(NM[1]);

        int arr[][] = new int[N][M];
        String input[];
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        int K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i ++){
            input = br.readLine().split(" ");
            int start_x = Integer.parseInt(input[0]),
                start_y = Integer.parseInt(input[1]),
                end_x   = Integer.parseInt(input[2]),
                end_y   = Integer.parseInt(input[3]), sum = 0;
            for(int j = start_x-1; j <= end_x-1; j ++){
                for(int k = start_y-1; k <= end_y-1; k ++){
                    sum += arr[j][k];
                }
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        bw.close();
    }
}
