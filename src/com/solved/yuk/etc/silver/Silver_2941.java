package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String alp[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="},
               input = br.readLine();

        for(int i = 0; i < alp.length; i++){
            input = input.replaceAll(alp[i],"!");
        }

        bw.write(input.length()+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
