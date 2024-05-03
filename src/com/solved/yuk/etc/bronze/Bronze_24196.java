package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24196 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for(int i = 0; i < input.length(); i ++){
            bw.write(String.valueOf(input.charAt(i)));
            i = i + input.charAt(i) - 65;
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
