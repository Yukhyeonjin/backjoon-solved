package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26772 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] heart = {
            " @@@   @@@ ",
            "@   @ @   @",
            "@    @    @",
            "@         @",
            " @       @ ",
            "  @     @  ",
            "   @   @   ",
            "    @ @    ",
            "     @     "
        };
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(heart[i]);
                if (j != n - 1) bw.write(" ");
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