package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), arr[][] = new int[100][100], count = 0;
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]),
                y = Integer.parseInt(input[1]);
            for(int j = x; j < x+10; j ++){
                for(int k = y; k < y+10; k ++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 100; j ++){
                if (arr[i][j] == 1) count++;
            }
        }
        bw.write(count+"");


        bw.flush();
        bw.close();
    }
}
