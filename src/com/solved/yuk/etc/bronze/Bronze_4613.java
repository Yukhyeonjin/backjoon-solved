package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4613 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"#".equals(input = br.readLine())) {
            int sum = 0;
            for (int i = 0; i < input.length(); i ++){
                if(' ' == input.charAt(i)) continue;
                sum += (i+1) * ((int)input.charAt(i) - 'A' + 1);
            }
            bw.write(sum+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}