package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32941 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        int N = Integer.parseInt(br.readLine());
        boolean flag = false;
        for (int i = 0; i < N; i ++) {
            int K = Integer.parseInt(br.readLine());
            int arr[] = new int[K];
            input = br.readLine().split(" ");
            flag = false;
            for (int j = 0; j < K; j ++) {
                arr[j] = Integer.parseInt(input[j]);
                if(arr[j] == X) {
                    flag = true;
                    break;
                }
            }
            if(!flag) break;
        }
        if(!flag) bw.write("NO");
        else bw.write("YES");

        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
