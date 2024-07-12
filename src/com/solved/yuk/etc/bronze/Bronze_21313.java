package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21313 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean odd = false;
        if(n % 2 == 1) {
            odd = true;
            n--;
        }
        StringBuilder sb = new StringBuilder();
        while (n --> 0) {
            if(n % 2 == 1) sb.append("1").append(" ");
            else sb.append("2").append(" ");
        }
        if(odd) sb.append("3");

        bw.write(sb.toString());



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}
