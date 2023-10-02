package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29752 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), num, next;
        String input[] = br.readLine().split(" ");
        int stric = 0, max = 0;
        for(int i = 0; i < N; i ++){
            num = Integer.parseInt(input[i]);
            if(num > 0) stric++;
            else {
                max = Math.max(stric, max);
                stric = 0;
            }
        }
        max = Math.max(stric, max);
        bw.write(max+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
