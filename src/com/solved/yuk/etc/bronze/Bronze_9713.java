package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++){
            int num = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int j = 0; j <= num; j ++){
                if(j% 2 == 1) sum += j;
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
