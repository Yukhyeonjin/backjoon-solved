package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31669 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arr = new int[M];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split("");
            for(int j = 0; j < M; j ++){
                if("X".equals(input[j])) arr[j]++;
            }
        }
        int result = -1;
        for(int i = 0; i < M; i ++){
            if(arr[i] == N) {
                result = i+1;
                break;
            }
        }
        if(result != -1) bw.write(result+"");
        else bw.write("ESCAPE FAILED");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
