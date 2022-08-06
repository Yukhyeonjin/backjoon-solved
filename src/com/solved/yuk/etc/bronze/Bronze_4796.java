package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int number = 1;
        while (!"0 0 0".equals(input = br.readLine())){
            String camping[] = input.split(" ");
            int L = Integer.parseInt(camping[0]), // L일 동안 사용
                P = Integer.parseInt(camping[1]), // 연속 하는 P일
                V = Integer.parseInt(camping[2]); // V일 짜리 휴가
            int sum =  (V / P) * L + Math.min((V % P), L);
            bw.write("Case " + number + ": " + sum + "\n");
            number++;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
