package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25893 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            bw.write(a + " " + b + " " + c);
            bw.newLine();
            if (a < 10 && b < 10 && c < 10) {
                bw.write("zilch");
                bw.newLine();
            } else if (a >= 10 && b >= 10 && c >= 10) {
                bw.write("triple-double");
                bw.newLine();
            } else if (a >= 10 && b < 10 && c < 10 || b >= 10 && a < 10 && c < 10 || c >= 10 && a < 10 && b < 10) {
                bw.write("double");
                bw.newLine();
            } else {
                bw.write("double-double");
                bw.newLine();
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}