package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            int N = Integer.parseInt(br.readLine()), sum = 0;
            double avg = 0.0;
            for(int j = 0; j < N; j ++){
                String input[] = br.readLine().split(" ");
                sum+=Integer.parseInt(input[0]);
                avg+=Double.parseDouble(input[1])*Integer.parseInt(input[0]);
            }
            bw.write(sum + " " + String.format("%.1f",(avg/sum))+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
