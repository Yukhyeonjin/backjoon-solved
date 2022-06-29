package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        long sum = Long.parseLong(input[0]) + Long.parseLong(input[1]),
             chicken = Long.parseLong(br.readLine());
        bw.write((sum >= chicken*2 ? sum - chicken*2 : sum)+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
