package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13228 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]),
                y1 = Integer.parseInt(input[1]),
                f1 = Integer.parseInt(input[2]),
                x2 = Integer.parseInt(input[3]),
                y2 = Integer.parseInt(input[4]),
                f2 = Integer.parseInt(input[5]);
            bw.write(Math.abs(x1-x2) + Math.abs(y1-y2) + f1+f2+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}