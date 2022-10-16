package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            bw.write(br.readLine().toLowerCase());
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
