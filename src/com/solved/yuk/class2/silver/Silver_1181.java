package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Silver_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int line = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>();
        for(int i = 0; i < line; i++){
            set.add(br.readLine());
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()) {
                    return -1;
                } else if(o1.length() > o2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            bw.write(it.next()+"\n");
        }

        bw.flush();
        bw.close();
    }
}
