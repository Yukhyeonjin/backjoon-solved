package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Double.parseDouble(br.readLine());
        String input;
        while (!("999").equals(input = br.readLine())){
            double b = Double.parseDouble(input);
            bw.write(String.format("%.02f", b - a)+"\n");
            a = b;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
