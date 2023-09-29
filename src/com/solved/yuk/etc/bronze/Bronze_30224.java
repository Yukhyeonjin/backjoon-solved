package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30224 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), result = 0;
        if(N % 7 == 0) result+=1;
        if(String.valueOf(N).contains("7")) result+=2;
        bw.write(result+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
