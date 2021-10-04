package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8370 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        bw.write(Integer.toString((Integer.parseInt(input[0]) * Integer.parseInt(input[1])) +
                                     (Integer.parseInt(input[2]) * Integer.parseInt(input[3])) ) );

        bw.flush();
        bw.close();

    }
}
