package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_9493 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double M = Double.parseDouble(st.nextToken());
            double A = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());

            if(M == 0 && A == 0 & B == 0) break;

            double result = Double.parseDouble(String.format("%.0f", (((M / A) - (M / B)) * 3600)));

            int h = (int) (result / 3600);
            int m = (int) ((result / 60) % 60);
            int s = (int) (result % 60);

            bw.write(String.format("%d:%02d:%02d", h, m, s)+"\n");
        }



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
