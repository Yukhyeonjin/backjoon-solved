package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28490 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), max = -1;
        for(int i = 0; i < n; i ++){
            String input[] = br.readLine().split(" ");
            max = Math.max(Integer.parseInt(input[0]) * Integer.parseInt(input[1]), max);
        }
        bw.write(max+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
