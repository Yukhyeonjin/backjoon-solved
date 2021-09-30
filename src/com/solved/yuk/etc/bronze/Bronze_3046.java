package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // S = (R1 + R2) / 2
        String[] input = br.readLine().split(" ");
        int R1   = Integer.parseInt(input[0]),
            S  = Integer.parseInt(input[1]),
            R2 = (2 * S) - R1;
        bw.write(Integer.toString(R2));

        bw.flush();
        bw.close();

    }
}
