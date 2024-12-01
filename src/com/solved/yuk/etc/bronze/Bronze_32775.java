package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32775 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Sab = Integer.parseInt(br.readLine());
        int Fab = Integer.parseInt(br.readLine());
        if(Sab < Fab) bw.write("high speed rail");
        else bw.write("flight");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}