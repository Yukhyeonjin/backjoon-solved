package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()),
            mod = n%8;
        mod = mod == 0 ? 2 : mod == 7 ? 3 : mod == 6 ? 4 : mod;
        bw.write(mod+"");

        bw.flush();
        bw.close();
    }
}
