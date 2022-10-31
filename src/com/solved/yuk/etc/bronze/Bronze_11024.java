package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            String input[] = br.readLine().split(" ");
            int sum = 0;
            for(int j = 0; j < input.length; j ++){
                int num = Integer.parseInt(input[j]);
                sum+=num;
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
