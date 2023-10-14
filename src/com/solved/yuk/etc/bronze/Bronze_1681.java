package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1681 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            L = Integer.parseInt(input[1]);
        int label = 1;
        for(int i = 0; i < N; i ++){
            while (true){
                if(!String.valueOf(label).contains(String.valueOf(L))){
                    label++;
                    break;
                }
                label++;
            }
        }
        bw.write((label-1)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

