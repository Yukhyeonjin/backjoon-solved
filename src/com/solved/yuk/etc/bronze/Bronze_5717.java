package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"0 0".equals(input = br.readLine())){
            int M = Integer.parseInt(input.split(" ")[0]),
                F = Integer.parseInt(input.split(" ")[1]);
            bw.write(M+F+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
