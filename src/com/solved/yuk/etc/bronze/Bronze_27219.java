package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int Vcount = n / 5, Icount = n % 5;
        for(int i = 0; i < Vcount; i++){
            bw.write("V");
        }
        for(int i = 0; i < Icount; i++){
            bw.write("I");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
