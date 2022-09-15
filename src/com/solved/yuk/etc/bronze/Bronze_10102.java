package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int V = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int BLength = input.replaceAll("A","").length(),
            ALength = input.replaceAll("B","").length();

        if(ALength > BLength) bw.write("A");
        else if(ALength < BLength) bw.write("B");
        else bw.write("Tie");

        bw.flush();
        br.close();
        bw.close();
    }
}
