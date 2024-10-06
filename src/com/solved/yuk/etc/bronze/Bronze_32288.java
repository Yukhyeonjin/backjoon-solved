package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32288 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");
        for (int i = 0; i < t; i++){
            if(input[i].equals("l")) bw.write("L");
            else if(input[i].equals("I")) bw.write("i");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}