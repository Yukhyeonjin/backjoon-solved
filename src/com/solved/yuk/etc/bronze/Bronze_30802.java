package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30802 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), t[] = new int[6];
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < input.length; i ++){
            t[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        int T = Integer.parseInt(input[0]), tSum = 0,
            P = Integer.parseInt(input[1]);
        for(int i = 0; i < t.length; i ++){
            tSum += (t[i] / T) + ((t[i] % T) > 0 ? 1 : 0);
        }
        bw.write(tSum + "\n" +
                N / P + " " + N % P);



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
