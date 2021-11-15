package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.*;

public class Silver_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
                M = Integer.parseInt(input[1]);
        Map<String, Boolean> nameMap = new HashMap<>();
        String name; boolean flag; int size = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < N+M; i ++){
            name = br.readLine();
            flag = nameMap.get(name) == null? false : true;
            if(flag) list.add(name);
            else nameMap.put(name, flag);
        }
        Collections.sort(list);
        bw.write(list.size() + "\n");
        for(int i = 0 ;i < list.size(); i ++){
            bw.write(list.get(i) + "\n");
        }


        bw.flush();
        bw.close();
    }
}
