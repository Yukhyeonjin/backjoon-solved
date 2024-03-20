package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29986 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), H = Integer.parseInt(input[1]), count = 0;
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            if(H >= Integer.parseInt(input[i])) count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
