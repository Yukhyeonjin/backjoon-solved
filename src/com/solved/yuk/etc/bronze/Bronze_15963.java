package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        bw.write(input[0].equals(input[1]) ? "1" : "0");

        bw.flush();
        bw.close();
    }
}
