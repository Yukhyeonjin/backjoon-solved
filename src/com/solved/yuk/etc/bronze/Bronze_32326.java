package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32326 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.parseInt(br.readLine())*3 + Integer.parseInt(br.readLine())*4 + Integer.parseInt(br.readLine())*5 +"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}