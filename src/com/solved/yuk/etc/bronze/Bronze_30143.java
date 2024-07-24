package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30143 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int A = Integer.parseInt(input[1]);
            int D = Integer.parseInt(input[2]);
            int sum = A;
            for (int j = 2; j <= N; j++){
                sum += (A+((j-1)*D));
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

