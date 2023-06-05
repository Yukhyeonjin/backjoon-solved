package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24267 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n= Long.parseLong(br.readLine());

        bw.write(n*(n-1)*(n-2)/6+"\n");
        bw.write("3");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

