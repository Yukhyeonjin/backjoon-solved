package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14209 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < N; i ++){
            String input = br.readLine();
            for(int j = 0; j < 13; j ++){
                char c = input.charAt(j);
                if(c == 'A') sum += 4;
                else if(c == 'K') sum += 3;
                else if(c == 'Q') sum += 2;
                else if(c == 'J') sum += 1;
            }
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
