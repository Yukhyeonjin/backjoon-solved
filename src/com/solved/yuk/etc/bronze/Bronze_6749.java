package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstAge = Integer.parseInt(br.readLine()),
            secondAge = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(secondAge + (secondAge - firstAge)));

        bw.flush();
        bw.close();

    }
}
