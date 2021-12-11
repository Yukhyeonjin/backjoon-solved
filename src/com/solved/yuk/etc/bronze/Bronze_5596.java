package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] minguk = br.readLine().split(" "), // 정보, 수학, 과학, 영어
                 manse  = br.readLine().split(" ");
        int A=0, B=0;
        for(int i = 0; i <4;i++) {
            A += Integer.parseInt(minguk[i]);
            B += Integer.parseInt(manse[i]);
        }
        bw.write((A > B ? A : B) + "");


        bw.flush();
        bw.close();

    }
}
