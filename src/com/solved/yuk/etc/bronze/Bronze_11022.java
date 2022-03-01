package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스
        String input[];
        for(int i = 0; i < T; i ++){
            input = br.readLine().split(" ");
            bw.write("Case #"+(i+1)+": "+ Integer.parseInt(input[0]) + " + " + Integer.parseInt(input[1])+ " = " +(Integer.parseInt(input[0])+Integer.parseInt(input[1]))+"\n");
        }

        bw.flush();
        bw.close();
    }
}
