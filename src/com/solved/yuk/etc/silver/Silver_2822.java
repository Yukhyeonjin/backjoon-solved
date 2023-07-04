package com.solved.yuk.etc.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Silver_2822 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sortArr[] = new int[8], arr[] = new int[8];
        for(int i = 0; i < 8; i ++){
            sortArr[i] = Integer.parseInt(br.readLine());
            arr[i] = sortArr[i];
        }
        Arrays.sort(sortArr);
        int sum = sortArr[3] + sortArr[4] + sortArr[5] + sortArr[6] + sortArr[7];
        bw.write(sum+"\n");
        for(int i = 0; i < 8; i ++){
            for(int j = 3; j < 8; j ++){
                if(arr[i] == sortArr[j]) {
                    bw.write((i+1)+" ");
                    break;
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
