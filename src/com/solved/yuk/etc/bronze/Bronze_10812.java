package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_10812 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < N; i ++){
            list.add(i+1);
        }

        int i, j, k;
        for(int l = 0; l < M; l ++){
            input = br.readLine().split(" ");
            i = Integer.parseInt(input[0]);
            j = Integer.parseInt(input[1]);
            k = Integer.parseInt(input[2]);

            int val = list.get(i-1);
            int end = list.get(k-1);

            while(val != end) {
                list.remove(i-1);
                list.add(j-1, val);
                val = list.get(i-1);
            }

        }

        for(int l = 0; l < N; l ++){
            bw.write(list.get(l) + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

