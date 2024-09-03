package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bronze_6030 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int P = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();
        for (int i = 1; i <= Math.max(P, Q); i++){
            if(P%i == 0) pList.add(i);
            if(Q%i == 0) qList.add(i);
        }
        for (int i = 0; i < pList.size(); i++) {
            for (int j = 0; j < qList.size(); j++) {
                bw.write(pList.get(i) + " " + qList.get(j));
                bw.newLine();
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