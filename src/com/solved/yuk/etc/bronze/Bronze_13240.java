package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13240 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        for (int i = 0; i < x; i ++){
            for (int j = 0; j < y; j++){
                if(i % 2 == 0 && j % 2 == 0){
                    bw.write("*");
                }
                if(i % 2 == 1 && j % 2 == 0){
                    bw.write(".");
                }
                if(i % 2 == 0 && j % 2 == 1){
                    bw.write(".");
                }
                if(i % 2 == 1 && j % 2 == 1){
                    bw.write("*");
                }
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
