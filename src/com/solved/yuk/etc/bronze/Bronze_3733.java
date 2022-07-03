package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine())!=null){
            int N = Integer.parseInt(input.split(" ")[0])+1,
                S = Integer.parseInt(input.split(" ")[1]);
            bw.write((S/N)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
