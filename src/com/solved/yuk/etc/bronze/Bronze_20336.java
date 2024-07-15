package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20336 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input[];
        for (int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            int d = Integer.parseInt(input[0]);
            if(input.length-1 == d) {
                bw.write(input[0]+"\n");
                for (int j = 1; j <= d; j ++){
                    bw.write(input[j]+"\n");
                }
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

