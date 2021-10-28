package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Silver_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < N; i ++){
            set.add(Integer.parseInt(br.readLine()));
        }
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            bw.write(itr.next()+"\n");
        }
        bw.flush();
        bw.close();
    }

}
