package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27890 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]),
            N = Integer.parseInt(input[1]);
        for(int i = 0; i < N; i ++){
            if(x % 2 == 0) x = (x/2) ^ 6;
            else x = (2*x) ^ 6;
        }
        bw.write(x+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

