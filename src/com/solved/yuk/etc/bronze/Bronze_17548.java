package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17548 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int cLength = (input.length() - 2) * 2;
        bw.write("h");
        for (int i = 0; i < cLength; i ++){
            bw.write("e");
        }
        bw.write("y");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

