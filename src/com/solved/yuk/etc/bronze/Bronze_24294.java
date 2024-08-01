package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24294 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int w1 = Integer.parseInt(br.readLine());
        int h1 = Integer.parseInt(br.readLine());
        int w2 = Integer.parseInt(br.readLine());
        int h2 = Integer.parseInt(br.readLine());
        bw.write((4 + 2 * Math.max(w1, w2) + 2 * (h1 + h2))+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}
