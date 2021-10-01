package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for(int i = 0; i < 4; i ++) {
            sum += Integer.parseInt(br.readLine());
        }
        int min = sum / 60,
            sec = sum % 60;
        bw.write(min + "\n" + sec);

        bw.flush();
        bw.close();

    }
}
