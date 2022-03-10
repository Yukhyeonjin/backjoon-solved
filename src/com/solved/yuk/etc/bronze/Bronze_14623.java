package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String B1 = br.readLine(),
               B2 = br.readLine();

        long B1n = Long.parseLong(B1,2),
             B2n = Long.parseLong(B2,2);

        String sum = Long.toBinaryString(B1n * B2n);

        bw.write(sum+"");

        bw.flush();
        bw.close();

    }
}
