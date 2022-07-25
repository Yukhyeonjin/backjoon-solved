package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            int count = 0;
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]),
                M = Integer.parseInt(input[1]);
            for(int j = N; j <= M; j ++){
                String number = Integer.toString(j);
                for(int k = 0; k < number.length(); k ++){
                    if('0' == number.charAt(k)) count++;
                }
            }
            bw.write(count+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
