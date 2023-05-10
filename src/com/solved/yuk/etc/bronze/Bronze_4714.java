package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4714 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double X;
        while(true) {
            X = Double.parseDouble(br.readLine());
            if(X < 0) break;
            bw.write("Objects weighing " + String.format("%.2f",X) + " on Earth will weigh " + String.format("%.2f", X*0.167) + " on the moon.\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

