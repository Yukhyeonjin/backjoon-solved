package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String input = br.readLine();
        bw.write(input.substring(T-5,T));

        bw.flush();
        br.close();
        bw.close();
    }

}
