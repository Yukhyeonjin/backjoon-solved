package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14592 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            S, C, L,
            maxS = 0, minC = 51, minL = 180, max = 0;
        String[] input;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            S = Integer.parseInt(input[0]);
            C = Integer.parseInt(input[1]);
            L = Integer.parseInt(input[2]);

            if(S > maxS){
                maxS = S;
                minC = C;
                minL = L;
                max = i+1;
            }
            else if(S == maxS){
                if(C < minC) {
                    maxS = S;
                    minC = C;
                    minL = L;
                    max = i+1;
                }
                else if(C == minC) {
                    if(L < minL) {
                        maxS = S;
                        minC = C;
                        minL = L;
                        max = i+1;
                    }
                }
            }
        }
        bw.write(max+"");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

