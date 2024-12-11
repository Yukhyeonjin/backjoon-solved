package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21200 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);
        int S = Integer.parseInt(input[2]);
        for(int i = 0; i < S; i++){
            input = br.readLine().split(" ");
            boolean flag = false;
            for(int j = 1; j < input.length; j++){
                if(P == Integer.parseInt(input[j])) {
                    flag = true;
                    break;
                }
            }
            if(flag) bw.write("KEEP\n");
            else bw.write("REMOVE\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
