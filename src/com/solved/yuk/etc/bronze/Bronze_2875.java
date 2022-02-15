package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), // 여학생
            M = Integer.parseInt(input[1]), // 남학생
            K = Integer.parseInt(input[2]), // 참여인원
            max = 0;
        for(int i = 0; i <= K; i++){
            int womanInternCount = K-i,
                manInternCount = K-womanInternCount;

            int womanCurrentCount = N-womanInternCount,
                manCurrentCount = M-manInternCount;

            if(womanCurrentCount < 0 || manCurrentCount < 0) continue;

            if((womanCurrentCount / 2) >= manCurrentCount) max = Math.max(max,manCurrentCount);
            else max = Math.max(max,womanCurrentCount/2);
        }
        bw.write(max+"");

        bw.flush();
        bw.close();
    }
}
