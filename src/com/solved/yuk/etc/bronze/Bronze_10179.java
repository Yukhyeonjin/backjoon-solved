package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            double number = Double.parseDouble(br.readLine());
            bw.write("$"+String.format("%.2f",(number * 0.8))+"\n");
        }

        bw.flush();
        bw.close();

    }
}
