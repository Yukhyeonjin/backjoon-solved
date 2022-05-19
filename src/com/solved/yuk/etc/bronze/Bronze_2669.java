package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[][] = new int[101][101];
        for(int i = 0; i < 4; i ++){
            String input[] = br.readLine().split(" ");
            int startX = Integer.parseInt(input[0]),
                startY = Integer.parseInt(input[1]),
                endX   = Integer.parseInt(input[2]),
                endY   = Integer.parseInt(input[3]);
            for(int j = startX; j < endX; j ++){
                for(int k = startY; k < endY; k++){
                    arr[j][k] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j] == 1) count++;
            }
        }
        bw.write(count+"");

        bw.flush();
        bw.close();
    }
}
