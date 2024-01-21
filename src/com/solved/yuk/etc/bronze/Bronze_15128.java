package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15128 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long p1 = Long.parseLong(input[0]),
             q1 = Long.parseLong(input[1]),
             p2 = Long.parseLong(input[2]),
             q2 = Long.parseLong(input[3]);
        boolean isAreaInteger = (p1 * p2 % (q1 * q2 * 2) == 0);

        bw.write((isAreaInteger ? 1 : 0)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}