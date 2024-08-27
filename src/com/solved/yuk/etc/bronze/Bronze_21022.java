package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21022 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N];
        int B[] = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            A[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            B[i] = Integer.parseInt(input[i]);
        }

        int aWin = 0, bWin = 0, aScore = 0, bScore = 0;
        for (int i = 0; i < N; i ++){
            if(A[i] > B[i]) {
                aWin++;
                aScore+=3;
            }
            else if(A[i] < B[i]) {
                bWin++;
                bScore+=3;
            }
            else {
                aScore++;
                bScore++;
            }
        }
        bw.write(aScore + "");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
