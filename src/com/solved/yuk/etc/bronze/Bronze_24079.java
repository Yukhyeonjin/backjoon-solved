package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24079 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine()),
            y = Integer.parseInt(br.readLine()),
            z = Integer.parseInt(br.readLine());
        bw.write((x+y>z ? 0 : 1)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

