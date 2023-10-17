package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28061 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), max = 0;
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            int apple = Integer.parseInt(input[i]) - (N-i);
            max = Math.max(apple, max);
        }
        bw.write(max+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

