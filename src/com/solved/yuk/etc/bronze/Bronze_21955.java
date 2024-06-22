package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21955 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int length = input.length();
        bw.write(input.substring(0,length/2) + " " + input.substring(length/2));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

