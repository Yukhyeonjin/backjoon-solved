package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int firstLen = input.length();
        input = br.readLine();
        int secondLen = input.length();
        if(firstLen >= secondLen)bw.write("go");
        else bw.write("no");

        bw.flush();
        bw.close();
    }
}
