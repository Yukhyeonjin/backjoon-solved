package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_25904 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), X = Integer.parseInt(input[1]);
        int[] max = new int[N], voice = new int[N];
        input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            max[i] = Integer.parseInt(input[i]);
        }
        int target = 0;
        while (true){
            voice[target] = X;
            if(max[target] < voice[target]) break;
            X++;
            if(target+1 == N) target = 0;
            else target++;
        }
        bw.write((target+1)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
