package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        bw.write(Integer.parseInt(N)*(Integer.parseInt(N)-1)+"");

        bw.flush();
        bw.close();

    }
}
