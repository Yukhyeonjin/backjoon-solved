package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8558 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), result = 1;
        for(int i = 1; i <= n; i ++){
            result *= i;
            result %= 10;
        }
        bw.write(result+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

