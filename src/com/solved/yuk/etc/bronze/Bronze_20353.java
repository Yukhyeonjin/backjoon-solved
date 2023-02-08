package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20353 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long a = Long.parseLong(br.readLine());
        bw.write(Math.sqrt(a) * 4+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
