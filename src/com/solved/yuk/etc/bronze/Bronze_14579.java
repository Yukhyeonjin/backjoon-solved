package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14579 {
    private static final int MOD = 14579;
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]);
        int tmp = (a+1)*a/2;
        tmp%=MOD;
        int answer = tmp;
        for (int i = a+1; i <= b; i++){
            answer*=(tmp+=i);
            answer%=MOD;
        }
        bw.write(answer+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

