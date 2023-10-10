package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10480 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            int x = Integer.parseInt(br.readLine());
            bw.write(x + " is " + (x%2 == 0 ? "even" : "odd"));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

