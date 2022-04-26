package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]),
            D = 0, count = 0;
        while (true){
            if(A == B || B == C) break;
            if(B - A >= C - B){
                if(B-A > 1){
                    C = B;
                    B = B-1;
                    count++;
                }else break;
            }else if(C - B > B - A){
                if(C-B > 1){
                    A = B;
                    B = B+1;
                    count++;
                }else break;
            }else break;
        }
        bw.write(count+"");

        bw.flush();
        bw.close();
    }
}
