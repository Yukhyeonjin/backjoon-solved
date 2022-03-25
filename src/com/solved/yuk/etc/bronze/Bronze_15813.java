package com.solvde.yuk.etc.bronze;

import java.io.*;

public class Bronze_15813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int sum = 0;
        for(int i = 0; i < N; i ++){
            sum += (int)name.charAt(i) - 64;
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
