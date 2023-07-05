package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.*;

public class Silver_11656 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine(); int length = S.length();
        Set<String> set = new TreeSet<>();
        for(int i = 0; i < length; i ++){
            set.add(S.substring(i, length));
        }
        Iterator<String> itr = set.iterator();
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
