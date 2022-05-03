package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[], pattern[];
        input = br.readLine().split("");
        pattern = input;
        for(int i = 1; i < N; i ++){
            input = br.readLine().split("");
            for(int j = 0; j < input.length; j++){
                if(!"?".equals(pattern[j]) && !input[j].equals(pattern[j])){
                    pattern[j] = "?";
                }
            }
        }
        for(int i = 0; i < pattern.length; i ++){
            bw.write(pattern[i]);
        }

        bw.flush();
        bw.close();
    }
}
