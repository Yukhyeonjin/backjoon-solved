package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "),
               AB = input[0] + input[1],
               CD = input[2] + input[3];
        bw.write(Long.parseLong(AB) + Long.parseLong(CD) + "");


        br.close();
        bw.flush();
        bw.close();
    }
}
