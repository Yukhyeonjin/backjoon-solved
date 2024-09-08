package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9306 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            String firstLine = br.readLine(), secondLine = br.readLine();
            bw.write("Case " + (i+1) + ": " + secondLine + ", " + firstLine);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}