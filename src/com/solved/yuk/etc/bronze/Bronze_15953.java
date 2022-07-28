package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A[] = new int[101],
            B[] = new int[65], index = 1;
        for(int i = 1; i <= 6; i++){
            for(int j = index; j < index+i; j++){
                if(i == 1) A[j] += 5000000;
                else if(i == 2) A[j] += 3000000;
                else if(i == 3) A[j] += 2000000;
                else if(i == 4) A[j] += 500000;
                else if(i == 5) A[j] += 300000;
                else if(i == 6) A[j] += 100000;
                //bw.write(A[j]+"\n");
            }
            index += i;
        }
        index = 1;
        for(int i = 1; i <= 16;){
            for(int j = index; j < index+i; j++){
                if(i == 1) B[j] += 5120000;
                else if(i == 2) B[j] += 2560000;
                else if(i == 4) B[j] += 1280000;
                else if(i == 8) B[j] += 640000;
                else if(i == 16) B[j] += 320000;
                //bw.write(B[j]+"\n");
            }
            index += i;
            i *= 2;
        }
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            bw.write(A[Integer.parseInt(input[0])] + B[Integer.parseInt(input[1])] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
