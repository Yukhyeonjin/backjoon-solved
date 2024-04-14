package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30886 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double r = Math.sqrt(Double.parseDouble(br.readLine())/Math.PI)+1;
        bw.write(4*r*r+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

