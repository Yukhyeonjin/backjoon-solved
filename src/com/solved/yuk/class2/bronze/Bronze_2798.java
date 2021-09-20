package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        String[] arr = br.readLine().split(" ");
        int output = 0, compareNumber = 0;
        for(int i = 0; i < N-2; i ++) {
            for(int j = i+1; j < N-1; j ++) {
                for(int k = j+1; k < N; k ++) {
                    compareNumber = Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) + Integer.parseInt(arr[k]);
                    if(compareNumber > output && compareNumber <= M) {
                        output = compareNumber;
                        break;
                    }
                }
                if(output == M) break;
            }
            if(output == M) break;
        }
        bw.write(Integer.toString(output));

        bw.flush();
        bw.close();
    }
}
