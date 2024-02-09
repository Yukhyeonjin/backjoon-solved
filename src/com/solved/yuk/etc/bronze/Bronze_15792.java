package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigDecimal;

public class Bronze_15792 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        BigDecimal A = new BigDecimal(input[0]);
        BigDecimal B = new BigDecimal(input[1]);
        bw.write(A.divide(B, 1000, BigDecimal.ROUND_HALF_UP).toString());

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
