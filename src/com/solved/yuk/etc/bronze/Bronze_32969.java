package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32969 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String result = "";

        if(input.contains("social") || input.contains("history") ||input.contains("language") ||input.contains("literacy")) {
            result = "digital humanities";
        }
        else result = "public bigdata";
        
        bw.write(result);
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
