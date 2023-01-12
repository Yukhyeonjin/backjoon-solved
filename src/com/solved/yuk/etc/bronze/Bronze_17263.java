package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        int max = -1;
        for(int i = 0; i < N; i ++){
            int num = Integer.parseInt(input[i]);
            max = Math.max(max, num);
        }
        bw.write(max+"");

        bw.flush();
        br.close();
        bw.close();

    }
}
