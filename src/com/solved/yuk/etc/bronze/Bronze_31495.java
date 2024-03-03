package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31495 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if(input.charAt(0) == '\"' && input.charAt(input.length()-1) == '\"' && input.length() > 2) bw.write(input.replaceAll("\"",""));
        else bw.write("CE");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}