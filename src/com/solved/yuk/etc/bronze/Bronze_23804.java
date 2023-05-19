package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23804 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < N * 5; j ++){
                bw.write("@");
            }
            bw.newLine();
        }
        for(int i = 0; i < N * 3; i ++){
            for(int j = 0; j < N; j ++){
                bw.write("@");
            }
            bw.newLine();
        }
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < N * 5; j ++){
                bw.write("@");
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

