package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1592 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]),
            L = Integer.parseInt(input[2]);
        int[] arr = new int[N];
        arr[0] = 1;
        int i = 0, count = 0;
        while (arr[i] != M) {
            if (arr[i] % 2 == 0) {
                i -= L;
                if (i < 0) {
                    i = N + i;
                }
            } else {
                i += L;
                if (i > N - 1) {
                    i = i - N;
                }
            }
            arr[i]++;
            count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
