package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), count = 0;
        String input[] = br.readLine().split(" ");
        for(int i = 1; i <= T; i ++){
            if(Integer.parseInt(input[i-1]) != i) count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
