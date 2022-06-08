package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]);
        double hp = a - (a * (b/100.00));
        bw.write(hp >= 100.00 ? "0" : "1");

        bw.flush();
        bw.close();
    }
}
