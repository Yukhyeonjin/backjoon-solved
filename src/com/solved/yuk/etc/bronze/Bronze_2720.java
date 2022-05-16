package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T != 0) {
            int cost = Integer.parseInt(br.readLine());

            int a = (int) cost / 25;
            int b = (int) (cost - a * 25) / 10;
            int c = (int) (cost - a * 25 - b * 10) / 5;
            int d = cost - a * 25 - b * 10 - c * 5;
            bw.write(a + " " + b + " " + c + " " + d+"\n");
            T--;
        }

        bw.flush();
        bw.close();
    }
}
