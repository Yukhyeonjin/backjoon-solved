package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Silver_4673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new TreeSet<Integer>();
        for(int i = 1; i <= 10000; i ++){
            set.add(i);
        }
        int i = 1;
        while (true) {
            if(i >= 10000) break;
            String[] convertInteger = Integer.toString(i).split("");
            int sum = i;
            for(int j = 0; j < convertInteger.length; j ++){
                sum += Integer.parseInt(convertInteger[j]);
            }
            if(sum <= 10000 && set.contains(sum)) set.remove(sum);
            i++;
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            bw.write(it.next()+"\n");
        }

        bw.flush();
        bw.close();
    }
}
