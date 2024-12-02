package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32776 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Sab = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int Ma = Integer.parseInt(input[0]);
        int Fab = Integer.parseInt(input[1]);
        int Mb = Integer.parseInt(input[2]);
        if(Sab <= Ma + Fab + Mb) bw.write("high speed rail");
        else if(Sab <= 240) bw.write("high speed rail");   
        else bw.write("flight");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
