package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26532 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]);
        bw.write((a * b / 4840) / 5 + 1 +"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
