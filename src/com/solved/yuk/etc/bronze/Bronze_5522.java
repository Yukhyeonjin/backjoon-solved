package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for(int i = 0; i < 5; i ++) {
            sum += Integer.parseInt(br.readLine());
        }
        bw.write(Integer.toString(sum));

        bw.flush();
        bw.close();

    }
}
