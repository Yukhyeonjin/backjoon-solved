package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28248 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int g = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int sum = g * 50 - l * 10;
        if(g > l) sum += 500;
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
