package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine()), // 방학
            A = Integer.parseInt(br.readLine()), // 국어 총 페이지
            B = Integer.parseInt(br.readLine()), // 수학 총 페이지
            C = Integer.parseInt(br.readLine()), // 하루 풀 수 있는 국어 페이지
            D = Integer.parseInt(br.readLine()); // 하루 풀 수 있는 수학 페이지
        int day = 0;
        int koreanDay = A/C + (A%C != 0 ? 1 : 0);
        int mathDay = B/D + (B%D != 0 ? 1 : 0);
        day = Math.max(koreanDay, mathDay);
        bw.write(Integer.toString(L-day));

        bw.flush();
        bw.close();
    }
}
