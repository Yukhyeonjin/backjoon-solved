package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30067 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for(int i = 0; i < 10; i ++){
            sum += Integer.parseInt(br.readLine());
        }
        bw.write(sum/2+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

