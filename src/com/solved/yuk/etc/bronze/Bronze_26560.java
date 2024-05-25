package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26560 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input = br.readLine();
            if(input.charAt(input.length()-1) != '.') bw.write(input+".");
            else bw.write(input);
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
