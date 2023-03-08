package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int i = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(input.charAt(i-1)));

        bw.flush();
        br.close();
        bw.close();
    }
}
