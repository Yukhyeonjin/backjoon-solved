package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer number = Integer.parseInt(br.readLine());
        bw.write(number - 543 + "");

        bw.flush();
        bw.close();
    }
}
