package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20528 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), cnt = 0;
        String input[] = br.readLine().split(" ");
        for (int i = 0; i < N-1; i ++){
            if(input[i].charAt(0) == input[i+1].charAt(0)) cnt++;
        }
        if(cnt == N-1) bw.write("1");
        else bw.write("0");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
