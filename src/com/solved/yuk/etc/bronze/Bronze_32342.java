package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32342 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String input = br.readLine();
            int s = input.length(), cnt = 0;
            for (int j = 0; j < s-2; j++){
                if("WOW".equals(input.substring(j,j+3))) cnt++;
            }
            bw.write(cnt+"");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}