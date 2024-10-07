package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32384 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++){
            bw.write("LoveisKoreaUniversity");
            if(i != N-1) bw.write(" ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}