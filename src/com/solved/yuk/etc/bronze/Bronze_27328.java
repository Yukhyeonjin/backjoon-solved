package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27328 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine());
        bw.write(A > B ? "1" : A < B ? "-1" : "0");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

