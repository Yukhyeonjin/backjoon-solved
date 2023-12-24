package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5363 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int nickNameCnt = Integer.parseInt(br.readLine());

        // 입력 및 필터
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nickNameCnt; i++) {
            String[] inputStr = br.readLine().split(" ");
            final int inputStrLength = inputStr.length;
            for (int j = 2; j < inputStrLength; j++) {
                sb.append(inputStr[j]).append(" ");
            }
            sb.append(inputStr[0]).append(" ").append(inputStr[1]);
            sb.append("\n");
        }

        sb.setLength(sb.length() - 1);
        bw.write(sb.toString());


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
