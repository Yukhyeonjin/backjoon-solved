package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9546 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), k;
        double p;
        for(int i = 0; i < T; i ++){
            k = Integer.parseInt(br.readLine());
            p = 1;
            for(int j = 1; j < k; j++){
                p = (p+0.5)*2;
            }
            bw.write((int)p+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

