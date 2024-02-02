package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_7600 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"#".equals(input = br.readLine().toLowerCase())) {
            int alpha[] = new int[26];
            for(int i = 0; i < input.length(); i ++){
                int number = input.charAt(i) - 'a';
                if(number >= 0 && number <= 26){
                    alpha[number]++;
                }
            }
            int answer = 0;
            for(int i = 0; i < alpha.length; i ++){
                if(alpha[i] > 0) answer++;
            }
            bw.write(answer+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
