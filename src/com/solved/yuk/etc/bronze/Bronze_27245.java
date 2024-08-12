package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27245 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        int a = w<l?w:l;
        int b = w<l?l:w;
        bw.write(a*2>=b&&a>=h*2 ? "good" : "bad");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}