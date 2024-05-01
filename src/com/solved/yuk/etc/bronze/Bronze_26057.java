package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26057 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        bw.write((2 * T - L) + "");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
