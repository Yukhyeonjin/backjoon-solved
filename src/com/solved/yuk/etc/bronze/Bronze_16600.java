package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double x = Double.parseDouble(br.readLine());
        bw.write(String.format("%.8f",Math.sqrt(x) * 4)+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
