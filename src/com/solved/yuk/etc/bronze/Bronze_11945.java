package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().split(" ")[0]);
        for(int i = 0; i < N; i ++){
            bw.write(new StringBuilder(br.readLine()).reverse().toString());
            bw.newLine();
        }


        br.close();
        bw.flush();
        bw.close();

    }
}
