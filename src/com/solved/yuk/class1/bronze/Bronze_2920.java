package com.solved.yuk.class1.bronze;

import java.io.*;

public class Bronze_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //char[] note = new char[]{'c', 'd', 'e', 'f', 'g', 'a', 'b', 'C'};
        String input = br.readLine().replaceAll(" ", "");
        String output = input.equals("12345678") ? "ascending" : input.equals("87654321") ? "descending" : "mixed";
        bw.write(output);

        bw.flush();
        bw.close();
    }
}
