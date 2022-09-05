package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Bronze_1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        String input[] = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i ++){
            int seat = Integer.parseInt(input[i]);
            if(set.contains(seat)) count++;
            else set.add(seat);
        }
        bw.write(count + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
