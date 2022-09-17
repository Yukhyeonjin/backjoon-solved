package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long area = Long.valueOf(br.readLine());
        double perimeter = (double) Math.round(Math.sqrt(area * Math.PI) * 2 * 1000000000) / 1000000000;
        bw.write(perimeter+"");

        bw.flush();
        bw.close();

    }
}
