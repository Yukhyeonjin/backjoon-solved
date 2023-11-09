package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14782 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int I = Integer.parseInt(br.readLine()), sum = 0;
        for(int i = 1; i <= Math.sqrt(I); i ++){
            if(I%i == 0) sum = sum + i + (I/i);
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

