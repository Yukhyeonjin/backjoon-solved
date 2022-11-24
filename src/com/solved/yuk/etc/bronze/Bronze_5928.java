package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int D = Integer.parseInt(input[0]),
            H = Integer.parseInt(input[1]),
            M = Integer.parseInt(input[2]);

        int time1 = 11 * 60 * 24 + 11 * 60 + 11;
        int time2 = D * 60 * 24 + H * 60 + M;

        int result = time2 - time1;

        bw.write((result < 0 ? -1 : result) + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
