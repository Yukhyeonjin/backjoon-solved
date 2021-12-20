package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.*;

public class Bronze_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스
        String input;
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < T; i ++){
            input = String.valueOf(br.readLine().charAt(0));
            int count = map.get(input) == null ? 0 : map.get(input);
            map.put(input, count+1);
            if(count+1 >= 5 && !list.contains(input)) list.add(input);
        }
        if(list.isEmpty()){
            bw.write("PREDAJA");
        }else {
            Collections.sort(list);
            for(int i = 0; i < list.size(); i ++){
                bw.write(list.get(i));
            }
        }

        bw.flush();
        bw.close();
    }
}
