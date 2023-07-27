package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15751 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]),
            end = Integer.parseInt(input[1]),
            x = Integer.parseInt(input[2]),
            y = Integer.parseInt(input[3]);
        int case1 = Math.abs(end - start);
        int case2 = Math.abs(start-x) + Math.abs(end-y);
        int case3 = Math.abs(start-y) + Math.abs(end-x);

        int answer = Math.min(case1, Math.min(case2, case3));

        bw.write(answer+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

