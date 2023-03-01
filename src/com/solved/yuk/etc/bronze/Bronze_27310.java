package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int sum = (input.length()) + (input.length() - input.replaceAll(":","").length()) + (input.length() - input.replaceAll("_","").length()) * 5;
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
