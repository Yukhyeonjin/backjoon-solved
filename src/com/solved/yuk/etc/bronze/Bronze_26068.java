package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split("-");
            count = Integer.parseInt(input[1]) <= 90 ? count+1 : count;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
