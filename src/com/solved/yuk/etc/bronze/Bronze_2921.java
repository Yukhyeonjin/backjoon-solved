package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), sum = 0;
        for(int i = 0; i <= N; i ++){
            for(int j = i; j <= N; j++){
                sum = sum + i + j;
            }
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();

    }
}
