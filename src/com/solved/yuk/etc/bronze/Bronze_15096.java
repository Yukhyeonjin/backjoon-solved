package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15096 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int cnt = 0, sum = 0;
        for (int i = 0; i < N; i ++){
            int sc = Integer.parseInt(input[i]);
            if(sc >= 0) {
                cnt++;
                sum += sc;
            }
        }
        double avg = (double) sum / cnt;
        bw.write(avg+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}