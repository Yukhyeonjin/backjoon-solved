package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]),
                C = Integer.parseInt(input[1]);
            bw.write((N/C + (N%C != 0 ? 1:0))+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}

