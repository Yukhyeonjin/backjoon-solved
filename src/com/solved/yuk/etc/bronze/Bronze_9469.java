package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9469 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());

        for (int i = 0; i < P; i++) {

            String st[] = br.readLine().split(" ");
            int N = Integer.parseInt(st[0]);
            double D = Double.parseDouble(st[1]);
            double A = Double.parseDouble(st[2]);
            double B = Double.parseDouble(st[3]);
            double F = Double.parseDouble(st[4]);

            bw.write(N + " " + String.format("%.6f", ((D / (A + B)) * F)));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
