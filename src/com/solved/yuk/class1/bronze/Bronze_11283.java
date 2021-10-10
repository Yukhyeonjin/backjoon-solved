package com.solved.yuk.class1.bronze;

import java.io.*;

public class Bronze_11283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char output = input.charAt(0);
        bw.write(Integer.toString((int)output - 44031));

        bw.flush();
        bw.close();
    }
}
