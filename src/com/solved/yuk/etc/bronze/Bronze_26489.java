package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26489 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int count = 0;
        while ((input = br.readLine()) != null) {
            if ("gum gum for jay jay".equals(input)) count++;
        }
        bw.write(count+"");

        bw.flush();
        bw.close();
        br.close();
    }

}