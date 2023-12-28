package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5300 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            bw.write(i+" ");
            if(i % 6 == 0 || i == N) bw.write("Go! ");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

