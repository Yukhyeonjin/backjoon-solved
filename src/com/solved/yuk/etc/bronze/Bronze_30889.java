package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30889 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), arr[][] = new int[10][20];
        String input;
        for(int i = 0; i < N; i ++){
            input = br.readLine();
            arr[(int)input.charAt(0)-(int)'A'][Integer.parseInt(input.substring(1))-1] = 1;
        }
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 20; j ++){
                if(arr[i][j] == 1) bw.write("o");
                else bw.write(".");
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

