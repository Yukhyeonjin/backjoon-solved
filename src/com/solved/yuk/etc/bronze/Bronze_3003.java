package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int king   = 1 - Integer.parseInt(input[0]),
            queen  = 1 - Integer.parseInt(input[1]),
            look   = 2 - Integer.parseInt(input[2]),
            bishop = 2 - Integer.parseInt(input[3]),
            night  = 2 - Integer.parseInt(input[4]),
            pawn   = 8 - Integer.parseInt(input[5]);
        bw.write(king + " " + queen + " " + look + " " + bishop + " " + night + " " + pawn);

        bw.flush();
        bw.close();

    }
}
