package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Silver_10867 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        Set<Integer> set = new TreeSet<>();

        for(int i = 0; i < N; i ++){
            set.add(Integer.parseInt(input[i]));
        }

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            bw.write(itr.next()+" ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
