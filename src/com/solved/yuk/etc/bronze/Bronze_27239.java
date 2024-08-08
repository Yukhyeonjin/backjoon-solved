package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27239 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(n % 8 == 1) sb.append("a");
        if(n % 8 == 2) sb.append("b");
        if(n % 8 == 3) sb.append("c");
        if(n % 8 == 4) sb.append("d");
        if(n % 8 == 5) sb.append("e");
        if(n % 8 == 6) sb.append("f");
        if(n % 8 == 7) sb.append("g");
        if(n % 8 == 0) sb.append("h");

        if(n % 8 != 0) sb.append((n/8)+1);
        else sb.append((n/8));

        bw.write(sb.toString());


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}