package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25304 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine()),
            N = Integer.parseInt(br.readLine()),
            sum = 0;
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]),
                b = Integer.parseInt(input[1]);
            sum = sum + (a*b);
        }
        bw.write(X == sum ? "Yes" : "No");


        br.close();
        bw.flush();
        bw.close();
    }
}
