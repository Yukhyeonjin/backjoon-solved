package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            I = Integer.parseInt(input[1]);
        int x = (I * A) - A + 1;
        bw.write(Integer.toString(x));

        bw.flush();
        bw.close();

    }
}
