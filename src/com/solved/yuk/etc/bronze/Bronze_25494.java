package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int min = Math.min(Integer.parseInt(input[0]), Math.min(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            bw.write(min+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
