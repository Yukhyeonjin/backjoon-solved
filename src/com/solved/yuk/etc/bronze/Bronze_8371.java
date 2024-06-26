package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8371 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i ++){
            if(a.charAt(i) != b.charAt(i)) cnt++;
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

