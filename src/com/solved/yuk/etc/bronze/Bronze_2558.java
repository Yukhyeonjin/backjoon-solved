package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()),
            B = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(A+B));

        bw.flush();
        bw.close();

    }
}
