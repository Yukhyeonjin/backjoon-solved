package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            double A = Integer.parseInt(input[0]) * 350.34,
                   B = Integer.parseInt(input[1]) * 230.90,
                   C = Integer.parseInt(input[2]) * 190.55,
                   D = Integer.parseInt(input[3]) * 125.30,
                   E = Integer.parseInt(input[4]) * 180.90;
            String result = String.format("%.2f", A+B+C+D+E);
            bw.write("$"+result+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
