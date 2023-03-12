package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Bronze_15917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Q = Integer.parseInt(br.readLine());
        Set<Long> set = new HashSet<Long>();
        long n = 2;
        set.add((long) 1);
        set.add(n);
        for(int i = 0; i <= 32; i ++) {
            n *= 2;
            set.add(n);
        }
        for(int i = 0; i < Q; i ++) {
            long a = Long.parseLong(br.readLine());
            if(set.contains(a)) bw.write("1\n");
            else bw.write("0\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}


