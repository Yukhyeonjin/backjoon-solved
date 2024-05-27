package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28519 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);

        int result = 0;

        if( X <= Y ) result = 2 * X;
        else result = 2 * Y;

        if( X != Y) result += 1;

        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
