package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bronze_31609 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i ++){
            set.add(Integer.parseInt(input[i]));
        }
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            bw.write(itr.next()+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}