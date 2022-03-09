package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10833 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), sum = 0;
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            sum+=Integer.parseInt(input[1])%Integer.parseInt(input[0]);
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
