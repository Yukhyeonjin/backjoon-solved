package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(br.readLine());
        bw.write(String.format("%.2f", n/4));

        bw.flush();
        br.close();
        bw.close();
    }

}
