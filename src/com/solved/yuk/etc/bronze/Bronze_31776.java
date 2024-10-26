package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31776 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i ++){
            String[] input = br.readLine().split(" ");
            int[] T = new int[3];
            for (int j = 0; j < 3; j ++){
                T[j] = Integer.parseInt(input[j]);
            }
            if(T[0] == -1 && T[1] == -1 && T[2] == -1) continue;
            if(T[0] > -1) {
                if(T[1] > -1 && T[2] > -1 && T[2] >= T[1] && T[1] >= T[0]) cnt++;
                else if(T[1] > -1 && T[2] == -1 && T[1] >= T[0]) cnt++;
                else if(T[1] == -1 && T[2] == -1) cnt++;
            }
        }
        bw.write(cnt+"");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}