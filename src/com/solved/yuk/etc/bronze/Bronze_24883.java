package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if("n".equals(input.toLowerCase()))bw.write("Naver D2");
        else bw.write("Naver Whale");

        bw.flush();
        bw.close();
    }
}
