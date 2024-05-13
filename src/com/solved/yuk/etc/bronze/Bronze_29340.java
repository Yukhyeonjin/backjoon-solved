package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29340 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        for (int i = 0; i < a.length(); i ++){
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            if(ac > bc) bw.write(String.valueOf(ac));
            else bw.write(String.valueOf(bc));
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
