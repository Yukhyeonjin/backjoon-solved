package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String NM[] = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]),
            M = Integer.parseInt(NM[1]);
        int arr[][] = new int[N][M];
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < N; j++){
                String input[] = br.readLine().split(" ");
                for(int k = 0; k < M; k++){
                    arr[j][k] += Integer.parseInt(input[k]);
                }
            }
        }
        for(int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                bw.write(arr[j][k]+" ");
            }
            bw.newLine();
        }



        bw.flush();
        bw.close();
    }
}
