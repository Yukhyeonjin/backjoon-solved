package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26594 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int cnt = 1;
        for (int i = 0; i <input.length()-1; i++){
            if(input.charAt(i) == input.charAt(i+1) ) cnt++;
            else break;
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}