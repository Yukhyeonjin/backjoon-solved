package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_1392 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            Q = Integer.parseInt(input[1]),
            time, question;
        List<Integer> timeList = new ArrayList<Integer>();
        for(int i = 1; i <= N; i++){
            time = Integer.parseInt(br.readLine());
            for(int j = 0; j < time; j ++){
                timeList.add(i);
            }
        }
        for(int i = 0; i < Q; i++){
            question = Integer.parseInt(br.readLine());
            bw.write(timeList.get(question)+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

