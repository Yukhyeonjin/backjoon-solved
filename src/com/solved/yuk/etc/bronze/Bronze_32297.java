package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32297 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String input = br.readLine();
        if(input.contains("gori")) bw.write("YES");
        else bw.write("NO");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}