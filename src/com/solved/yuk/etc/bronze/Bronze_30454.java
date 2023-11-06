package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30454 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            L = Integer.parseInt(input[1]),
            arr[] = new int[N], oneCount = 0, max = 0;

        for(int i = 0; i < N; i ++){
            input = br.readLine().split("");
            oneCount = 0;
            for(int j = 0; j < L; j ++){
                if("1".equals(input[j])){
                    if(oneCount == 0) arr[i]++;
                    oneCount++;
                } else {
                    oneCount = 0;
                }
            }
            max = Math.max(max, arr[i]);
        }
        int count = 0;
        for(int i = 0; i < N; i ++){
            if(arr[i] == max) count++;
        }
        bw.write(max+" " + count);

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

