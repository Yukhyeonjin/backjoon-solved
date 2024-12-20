package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3578 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(br.readLine());
        int eight = h / 2;
        h %= 2;

        if (eight == 0 && h == 0) {
            bw.write("1");
        } else if (eight == 0 && h == 1) {
            bw.write("0");
        } else {
            for (int i = 0; i < h; i++) {
                bw.write("4");
            }
            for (int i = 0; i < eight; i++) {
                bw.write("8");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

}
