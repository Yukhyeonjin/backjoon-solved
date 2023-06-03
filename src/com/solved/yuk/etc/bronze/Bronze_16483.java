package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16483 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //a^2 = (T/2)^2 + b^2
        //a^2 - b^2 = (T/2)^2
        int t = Integer.parseInt(br.readLine());
        bw.write(t*t/4 +"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

