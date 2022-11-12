package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_16099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            BigInteger lt = new BigInteger(input[0]),
                       wt = new BigInteger(input[1]),
                       le = new BigInteger(input[2]),
                       we = new BigInteger(input[3]);
            int result = lt.multiply(wt).compareTo(le.multiply(we));
            bw.write(result == 1 ? "TelecomParisTech" : result == 0 ? "Tie" : "Eurecom");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
