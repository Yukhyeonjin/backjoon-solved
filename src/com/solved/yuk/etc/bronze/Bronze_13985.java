package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        bw.write(Integer.parseInt(input[0]) + Integer.parseInt(input[2]) == Integer.parseInt(input[4]) ? "YES" : "NO");


        bw.flush();
        br.close();
        bw.close();
    }
}
