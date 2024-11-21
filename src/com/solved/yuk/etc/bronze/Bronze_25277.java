package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25277 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        
        int cnt = 0;
        for(int i = 0; i < N; i ++){
            String word = input[i];
            if("he".equals(word) || "him".equals(word) || "she".equals(word) || "her".equals(word)) cnt++;
        }
        bw.write(cnt+"");
        


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
