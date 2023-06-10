package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28224 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), sum = 0;
        for(int i = 0; i < n; i ++){
            sum += Integer.parseInt(br.readLine());
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

