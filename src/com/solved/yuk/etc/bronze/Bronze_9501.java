package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            double D = Double.parseDouble(input[1]);
            int count = 0;
            for(int j = 0; j < N; j++){
                input = br.readLine().split(" ");
                double v = Double.parseDouble(input[0]),
                       f = Double.parseDouble(input[1]),
                       c = Double.parseDouble(input[2]);
                if ((D / v) * c <= f) // (거리/속도)*연료소비율 <= 연료량
                    count++;
            }
            bw.write(count+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
