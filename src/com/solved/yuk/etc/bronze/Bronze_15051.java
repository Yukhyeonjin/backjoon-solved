package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15051 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A1 = Integer.parseInt(br.readLine()),
            A2 = Integer.parseInt(br.readLine()),
            A3 = Integer.parseInt(br.readLine());
        int case1 = A2*2 + A3*4,
            case2 = A1*2 + A3*2,
            case3 = A1*4 + A2*2;
        bw.write(Math.min(case1, Math.min(case2, case3))+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

