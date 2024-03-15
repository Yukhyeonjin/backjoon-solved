package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31614 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int H = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        bw.write(H*60+M+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
