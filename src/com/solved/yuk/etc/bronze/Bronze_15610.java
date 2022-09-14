package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%.8f",Math.sqrt(Double.parseDouble(br.readLine()))*4)+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
