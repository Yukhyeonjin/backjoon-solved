package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3035 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "),
               arr[][] = new String[51][51];
        int R = Integer.parseInt(input[0]),
            C = Integer.parseInt(input[1]),
            ZR = Integer.parseInt(input[2]),
            ZC = Integer.parseInt(input[3]);
        for(int i = 0; i < R; i ++){
            input = br.readLine().split("");
            for(int j = 0; j < C; j++){
                arr[i][j] = input[j];
            }
        }
        for(int i = 0; i < R; i++){
            for(int l = 0; l < ZR; l++){
                for(int j = 0; j < C; j++){
                    for(int k = 0; k < ZC; k++){
                        bw.write(arr[i][j]);
                    }
                }
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

