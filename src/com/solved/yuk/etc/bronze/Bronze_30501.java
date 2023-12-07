package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30501 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input;
        for(int i = 0; i < N; i ++){
            input = br.readLine();
            if(input.contains("S")) {
                bw.write(input);
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}