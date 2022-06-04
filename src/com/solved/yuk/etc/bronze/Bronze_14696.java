package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_14696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // ▲ : 1, ■ : 2, ● : 3, ★ : 4
        int A[] = new int[5],
            B[] = new int[5],
            N = Integer.parseInt(br.readLine());
        String input[];
        for(int i = 0; i < N; i ++){
            Arrays.fill(A,0);
            Arrays.fill(B,0);
            for(int j = 0; j < 2; j ++){
                input = br.readLine().split(" ");
                for(int k = 1; k < input.length; k++){
                    if(j % 2 == 0){
                        A[Integer.parseInt(input[k])]+=1;
                    }else {
                        B[Integer.parseInt(input[k])]+=1;
                    }
                }
            }

            for(int j = 4; j >= 1; j--){
                if(A[j] > B[j]) {
                    bw.write("A");
                    break;
                }
                if(A[j] < B[j]) {
                    bw.write("B");
                    break;
                }
                if(j == 1) bw.write("D");
            }
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }
}
