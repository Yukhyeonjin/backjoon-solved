package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); double V = 0;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            double Ai = Double.parseDouble(input[i]);
            V += (100 - V) * (Ai/100);
            bw.write(V+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
