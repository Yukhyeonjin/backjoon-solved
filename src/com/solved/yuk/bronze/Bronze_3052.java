package com.solved.yuk.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Bronze_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();
        int input;
        for(int i = 0; i < 10; i ++) {
            input = Integer.parseInt(br.readLine());
            set.add(input % 42);
        }
        bw.write(set.size()+"");

        bw.flush();
        bw.close();
    }
}
