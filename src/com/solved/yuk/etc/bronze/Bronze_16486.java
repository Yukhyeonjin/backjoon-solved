package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d1 = Integer.parseInt(br.readLine()), // C 가로
            d2 = Integer.parseInt(br.readLine());
        bw.write(((d1*2) + (2*d2*3.141592)) +"");

        bw.flush();
        bw.close();
    }
}
