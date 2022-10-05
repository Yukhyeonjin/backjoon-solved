package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), A[] = new int[N], B[] = new int[N];
        for(int i = 0; i < 2; i ++){
            String input[] = br.readLine().split(" ");
            for(int j = 0; j < N; j++){
                if(i == 0) A[j] = Integer.parseInt(input[j]);
                else B[j] = Integer.parseInt(input[j]);
            }
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i] * B[N-1-i];
        }
        bw.write(sum+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
