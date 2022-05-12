package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i ++){
            int s = Integer.parseInt(br.readLine()),
                n = Integer.parseInt(br.readLine());
            for(int j = 0; j < n; j ++){
                String input[] = br.readLine().split(" ");
                s+=(Integer.parseInt(input[0]) * Integer.parseInt(input[1]));
            }
            bw.write(s+"\n");
        }

        bw.flush();
        bw.close();
    }
}
