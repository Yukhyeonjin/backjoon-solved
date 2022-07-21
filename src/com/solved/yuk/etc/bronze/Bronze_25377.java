package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), min = 1001;
        for (int i = 0; i < N; i++){
            String input[] = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]),
                B = Integer.parseInt(input[1]);
            if(A <= B) {
                min = Math.min(B,min);
            }
        }
        if(min == 1001) bw.write("-1");
        else bw.write(min+"");


        bw.flush();
        br.close();
        bw.close();
    }
}