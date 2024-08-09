package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27213 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int result = (2 * m) + (2 * n) - 4;

        if (m == 1 || n == 1) result = (m + n) - 1;

        bw.write(result+"");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}