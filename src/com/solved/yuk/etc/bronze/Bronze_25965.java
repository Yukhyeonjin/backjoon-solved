package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25965 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            int M = Integer.parseInt(br.readLine());

            long total = 0L;

            long[] krr = new long[M];
            long[] drr = new long[M];
            long[] arr = new long[M];

            for(int j = 0; j < M; j ++){
                input = br.readLine().split(" ");

                krr[j] = Long.parseLong(input[0]);
                drr[j] = Long.parseLong(input[1]);
                arr[j] = Long.parseLong(input[2]);
            }

            input = br.readLine().split(" ");

            long k = Long.parseLong(input[0]);
            long d = Long.parseLong(input[1]);
            long a = Long.parseLong(input[2]);

            for(int j = 0; j < M; j ++){
                long sum = (krr[j] * k) - (drr[j] * d) + (arr[j] * a);

                if(sum > 0) total += sum;
            }
            bw.write(total+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}